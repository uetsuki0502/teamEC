package com.internousdev.milkyway.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.CartInfoDAO;
import com.internousdev.milkyway.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{
	private List<CartInfoDTO> cartInfoDTOList = new ArrayList<CartInfoDTO>();
	private Map<String, Object> session;
	private int cartTotalPrice;

	public String execute() {
		if(!(session.containsKey("tempUserId")) && !(session.containsKey("userId"))) {
			return "sessionTimeout";
		}

		String userId;
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined)? 0 : Integer.parseInt(tempLogined);
		if(logined == 1) {
			userId = session.get("userId").toString();
		}else {
			userId = session.get("tempUserId").toString();
		}
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		cartInfoDTOList = cartInfoDAO.getCartList(userId);
		for(int i = 0; i < cartInfoDTOList.size(); i++) {
			cartTotalPrice += cartInfoDTOList.get(i).getTotalPrice();
		}
		return SUCCESS;

	}

	public List<CartInfoDTO> getCartInfoDTOList() {
		return cartInfoDTOList;
	}

	public void setCartInfoDTOList(List<CartInfoDTO> cartInfoDTOList) {
		this.cartInfoDTOList = cartInfoDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getCartTotalPrice() {
		return cartTotalPrice;
	}

	public void setCartTotalPrice(int cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}

}
