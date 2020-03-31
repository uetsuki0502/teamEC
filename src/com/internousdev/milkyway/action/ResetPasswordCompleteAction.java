package com.internousdev.milkyway.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;

	public String execute() {

		String result = ERROR;
		//新しいPasswordをDAOへ登録
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		int count = userInfoDAO.resetPassword(session.get("userIdForResetPassword").toString(), session.get("newPassword").toString());

		if (count > 0) {
			result = SUCCESS;
		}//Passsword再設定成功の場合履歴削除
		session.remove("userIdForResetPassword");
		session.remove("newPassword");

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
