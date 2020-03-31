package com.internousdev.milkyway.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.UserInfoDAO;
import com.internousdev.milkyway.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {

	UserInfoDTO userInfoDTO;
    private Map<String,Object> session;
	public String execute() {

        //ログインできなかった場合
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined)? 0 : Integer.parseInt(tempLogined);
		if(logined != 1) {
			return "loginError";
		}
        //ログインできた場合
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		userInfoDTO = userInfoDAO.getUserInfoDTO(String.valueOf(session.get("userId")));

		return SUCCESS;

	}
	public UserInfoDTO getUserInfoDTO() {
		return userInfoDTO;
	}

	public void setUserInfoDTO(UserInfoDTO userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}

	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}

}

