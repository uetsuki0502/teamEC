package com.internousdev.milkyway.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.PurchaseHistoryInfoDAO;
import com.internousdev.milkyway.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;
	private List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList;

    //    履歴の削除を行う
	public String execute() {
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined)? 0 : Integer.parseInt(tempLogined);
		if(logined != 1) {
			return "loginError";
		}

		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getMyPageUserInfo(String.valueOf(session.get("userId")));

		return SUCCESS;

	}

	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryInfoDTOList(){
		return purchaseHistoryInfoDTOList;
	}


	public void setPurchaseHistoryInfoDTOList(List<PurchaseHistoryInfoDTO>purchaseHistoryInfoDTOList) {
		this.purchaseHistoryInfoDTOList = purchaseHistoryInfoDTOList;
	}

	public Map<String,Object> getsession(){
		return session;
	}

	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
}


