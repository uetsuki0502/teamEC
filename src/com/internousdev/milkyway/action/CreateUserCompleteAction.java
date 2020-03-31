package com.internousdev.milkyway.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		String sex = "";

		//男性、女性どちらなのかを判別
		if ("女性".equals(String.valueOf(session.get("sex")))) {
			sex = "1";
		} else {
			sex = "0";
		}

		UserInfoDAO userInfoDAO = new UserInfoDAO();
		int count = userInfoDAO.createUser(
		//セッション変数を取り出す
		//基本データ型の変数をString型に変更
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				String.valueOf(session.get("familyNameKana")),
				String.valueOf(session.get("firstNameKana")),
				sex,
				String.valueOf(session.get("email")),
				session.get("userIdForCreateUser").toString(),
				session.get("password").toString());
		//Countが１以上ならsessionに格納する。
		if(count > 0) {
			result = SUCCESS;
			session.put("createUserFlag", "1");
		}
		//ユーザー情報を削除
		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyNameKana");
		session.remove("firstNameKana");
		session.remove("sex");
		session.remove("sexList");
		session.remove("email");
		session.remove("password");
		//結果を返す。
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}