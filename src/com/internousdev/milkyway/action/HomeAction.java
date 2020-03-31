package com.internousdev.milkyway.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.MCategoryDAO;
import com.internousdev.milkyway.dto.MCategoryDTO;
import com.internousdev.milkyway.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

//ログインフラグを保持していない場合は、未ログインとしてログインフラグを保持する。
	public String execute() {
		if(!session.containsKey("logined")) {
			session.put("logined", 0);
		}
//未ログイン状態、かつ仮ユーザーIDを保持していない場合は、仮ユーザーID(16桁のランダムな数字)を作成。
		String tempLogined = String.valueOf(session.get("logined"));
		int userId = "null".equals(tempLogined) ? 0 : Integer.parseInt(tempLogined);
		 if (!session.containsKey("tempUserId") && userId == 0) {
			 CommonUtility commonUtility = new CommonUtility();
			 session.put("tempUserId", commonUtility.getRamdomValue());
		}
//DBのカテゴリーマスターテーブルからカテゴリーを取得し、DB以外の保存領域に保存する。
		if(!session.containsKey("mCategoryDTOList")) {
			List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
		    mCategoryDTOList= mCategoryDAO.getMCategoryList();

			session.put("mCategoryDTOList", mCategoryDTOList);
		}
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}