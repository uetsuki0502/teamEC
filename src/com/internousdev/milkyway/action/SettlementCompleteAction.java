package com.internousdev.milkyway.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.CartInfoDAO;
import com.internousdev.milkyway.dao.PurchaseHistoryInfoDAO;
import com.internousdev.milkyway.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{

	private String id;
	private Map<String,Object> session;

	public String execute(){
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined)? 0 : Integer.parseInt(tempLogined);
		if(logined !=1) {    //登録失敗した場合はシステムエラー画面に遷移する
			return "loginError";
		}

		String result = ERROR;
		String userId = session.get("userId").toString();

		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		List<CartInfoDTO> cartInfoDTOList = cartInfoDAO.getCartList(userId);

		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		int count = 0;
		for (CartInfoDTO dto : cartInfoDTOList) {  //DBの購入履歴情報テーブルに商品ごとの決済情報を登録
			count += purchaseHistoryInfoDAO.regist
					(userId,dto.getProductId(),dto.getProductCount(),Integer.parseInt(id),dto.getPrice());
		}
		if(count == cartInfoDTOList.size()) {   //ユーザーに紐づいているDBのカート情報テーブルの情報を削除する
			count = cartInfoDAO.deleteCartList(String.valueOf(session.get("userId")));
			if(count > 0) {
				result = SUCCESS;
			}
		}
		return result;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
