
package com.internousdev.milkyway.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateUserAction extends ActionSupport implements SessionAware{
	private String backFlag;
	private Map<String, Object> session;

	public String execute() {
		//変数がnullであれば、ユーザー情報を削除する
		if (backFlag == null) {
			session.remove("familyName");
			session.remove("firstName");
			session.remove("familyNameKana");
			session.remove("firstNameKana");
			session.remove("sex");
			session.remove("sexList");
			session.remove("email");
			session.remove("userIdForCreateUser");
			session.remove("password");
		}
		//sessionのキー(sex)を検索してあればsession変数を格納する。
		//それ以外の場合は、基本データ型からString型に変更して変数を取り出す。
		if(!session.containsKey("sex")) {
			session.put("sex", "男性");
		}else {
			session.put("sex", String.valueOf(session.get("sex")));
		}

		// 選択肢を生成
		if (!session.containsKey("sexList")) {
			List<String> sexList = new ArrayList<String>();
			sexList.add("男性");
			sexList.add("女性");
			session.put("sexList", sexList);
		}

		return SUCCESS;
	}
	public String getBackFlag() {
		return backFlag;
	}

	public void setBackFlag(String backFlag) {
		this.backFlag = backFlag;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}