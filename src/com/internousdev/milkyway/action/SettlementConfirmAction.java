package com.internousdev.milkyway.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.DestinationInfoDAO;
import com.internousdev.milkyway.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementConfirmAction extends ActionSupport implements SessionAware{

	private List<DestinationInfoDTO> destinationInfoDTOList;
	private Map<String,Object> session;
	public String execute() {
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined)? 0 : Integer.parseInt(tempLogined);
		if(logined != 1) {   //未ログイン時はカートフラグをDB以外の保存領域に保持し、ログイン画面へ遷移させる
			return "loginError";
		}

		//ログイン時は決済画面に移行、ログインしてる場合はユーザーIDを取得する
		String userId = session.get("userId").toString() ;

		//ユーザーに紐づく
		DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
		destinationInfoDTOList=destinationInfoDAO.getDestinationInfo(userId);
		return SUCCESS;

	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	public List<DestinationInfoDTO> getDestinationInfoDTOList() {
		return destinationInfoDTOList;
	}
	public void setDestinationInfoDTOList(List<DestinationInfoDTO> destinationInfoDTOList) {
		this.destinationInfoDTOList = destinationInfoDTOList;
	}
}
