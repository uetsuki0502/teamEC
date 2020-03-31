package com.internousdev.milkyway.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.DestinationInfoDAO;
import com.internousdev.milkyway.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteDestinationAction extends ActionSupport implements SessionAware{

	private String id;
	private List<DestinationInfoDTO> destinationInfoDTOList;
	private Map<String,Object> session;

	public String execute() throws SQLException{
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined)? 0 : Integer.parseInt(tempLogined);
		if(logined != 1) {   //削除失敗した場合は、システムエラー画面に遷移
			return "loginError";
		}
		//削除が成功した場合は、DBの宛先情報テーブルの情報を取得して決済確認画面に遷移
		String result = ERROR;
		DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
		int count = destinationInfoDAO.myPageListDelete(id);

		if(count > 0) {
			destinationInfoDTOList=destinationInfoDAO.getDestinationInfo(session.get("userId").toString());
			result=SUCCESS;
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
	public List<DestinationInfoDTO> getDestinationInfoDTOList() {
		return destinationInfoDTOList;
	}
	public void setDestinationInfoDTOList(List<DestinationInfoDTO> destinationInfoDTOList) {
		this.destinationInfoDTOList = destinationInfoDTOList;
	}
}