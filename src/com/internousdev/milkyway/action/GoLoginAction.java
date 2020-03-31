package com.internousdev.milkyway.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoLoginAction extends  ActionSupport implements SessionAware{

	private String cartFlg;
	private Map<String, Object> session;

	public String execute() {
		if(cartFlg != null)
		session.put("cartFlg",1);
		return SUCCESS;
	}

	public String getCartFlg() {
		return cartFlg;
	}

	public void setCartFlg(String cartFlg) {
		this.cartFlg = cartFlg;
	}

	@SuppressWarnings("unused")
	private Map<String, Object> getSession(){
		return this.getSession();
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
