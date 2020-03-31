package com.internousdev.milkyway.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.PurchaseHistoryInfoDAO;
import com.internousdev.milkyway.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeletePurchaseHistoryAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList;

	public String execute() {
        //	削除成功した場合、購入履歴一覧画面に遷移
        //	削除できなかった場合、システム画面に移動
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined)? 0 : Integer.parseInt(tempLogined);
		if(logined !=1) {
			return "loginError";
		}


		String result = ERROR;
		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		int count = purchaseHistoryInfoDAO.buyItemHistoryDelete(String.valueOf(session.get("userId")));

		if(count > 0) {
			purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getMyPageUserInfo(String.valueOf(session.get("userId")));
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryInfoDTOList() {
		return purchaseHistoryInfoDTOList;
	}

	public void setPurchaseHistoryInfoDTOList(List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList) {
		this.purchaseHistoryInfoDTOList = purchaseHistoryInfoDTOList;
	}



}
