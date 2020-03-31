package com.internousdev.milkyway.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.CartInfoDAO;
import com.internousdev.milkyway.dao.UserInfoDAO;
import com.internousdev.milkyway.dto.CartInfoDTO;
import com.internousdev.milkyway.dto.UserInfoDTO;
import com.internousdev.milkyway.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String userId;
	private String password;
	private Map<String,Object> session;
	private List<CartInfoDTO> cartInfoDTOList;
	private int cartTotalPrice;
	private String isNotUserInfoMessage;
	private boolean savedUserIdFlg;
	private List<String> userIdErrorMessageList;
	private List<String> passwordErrorMessageList;

	private UserInfoDAO userInfoDAO = new UserInfoDAO();
	private UserInfoDTO userInfoDTO = new UserInfoDTO();
	private CartInfoDAO cartInfoDAO = new CartInfoDAO();

	public String execute() {
		String result = ERROR;
		//認証チェック
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		session.remove("savedUserIdFlg");

		if(session.containsKey("createUserFlag")
				&& Integer.parseInt(session.get("createUserFlag").toString()) == 1) {
			//ユーザー入力画面からの遷移場合
			userId = session.get("userIdForCreateUser").toString();
			//ユーザー情報入力完了画面から遷移した場合にユーザー情報がsessionに入っているため削除
			session.remove("userIdForCreateUser");
			session.remove("createUserFlg");
		}else {
			InputChecker inputChecker = new InputChecker();
			userIdErrorMessageList = inputChecker.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false, false);
			passwordErrorMessageList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, false, false);

			if(userIdErrorMessageList.size() > 0
					|| passwordErrorMessageList.size() > 0) {
				session.put("logined", 0);
				return result;
			}
			//認証処理
			if(!(userInfoDAO.isExistsUserInfo(userId, password))) {
				isNotUserInfoMessage = "ユーザーIDまたはパスワードが異なります。";
				return result;
			}
		}
		//セッションタイムアウト確認
		if(!(session.containsKey("tempUserId")) && !(session.containsKey("tempUserId"))) {
			result = "sessionTimeout";
			return result;
		}

		CartInfoDAO cartinfoDAO = new CartInfoDAO();
		String kariUserId = session.get("tempUserId").toString();
		List<String> productIdList = new ArrayList<>();
		//仮ユーザーIDに紐づくカート情報が存在するチェック
		boolean boo = cartinfoDAO.confirmCartInfo(kariUserId);
		if(boo) {
			//仮ユーザーIDに紐づく商品IDをproductIdListに格納
			productIdList = cartinfoDAO.selectCartInfo(kariUserId);
			int res = 0;
			//productIdListに格納されている商品IDの数だけ繰り返す
			for(int i = 0; i < productIdList.size(); i++) {
				//ユーザーIDの商品IDとproductIdListに格納された商品IDが同じか調べ、同じならtrue,同じでなければfalse
				boolean bool = cartinfoDAO.searchCartInfo(userId, productIdList.get(i));
				if(bool) {
					//仮ユーザーIDの商品IDとユーザーIDの商品IDが紐づく場合
					res = cartinfoDAO.countupProductId(userId, kariUserId,productIdList.get(i));
				}else {
					//仮ユーザーIDの商品IDとユーザーIDの商品IDが紐づかない場合
					res = cartInfoDAO.updateUserId(userId, kariUserId,	 productIdList.get(i));
				}
				if(res < 1) {
					result = "DBerror";
					return result;
				}
			}
		}
		//認証情報
		session.put("userId", userId);
		session.put("logined", 1);
//		//ユーザーID保存にチェックされていた場合
		if (savedUserIdFlg) {
			session.put("savedUserIdFlg", true);
		}
		session.remove("tempUserId");
		//カートフラグの確認
		if(session.containsKey("cartFlg")) {
			result = "cart";
			cartInfoDTOList = cartInfoDAO.getCartList(userId);
            for(int i = 0; i < cartInfoDTOList.size(); i++) {
                cartTotalPrice += cartInfoDTOList.get(i).getTotalPrice();
            }
			return result;
		}else {
			result = SUCCESS;
			return result;
		}
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public List<CartInfoDTO> getCartInfoDTOList() {
		return cartInfoDTOList;
	}
	public void setCartInfoDTOList(List<CartInfoDTO> cartInfoDTOList) {
		this.cartInfoDTOList = cartInfoDTOList;
	}
	public int getCartTotalPrice() {
		return cartTotalPrice;
	}
	public void setCartTotalPrice(int cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}
	public String getIsNotUserInfoMessage() {
		return isNotUserInfoMessage;
	}
	public void setIsNotUserInfoMessage(String isNotUserInfoMessage) {
		this.isNotUserInfoMessage = isNotUserInfoMessage;
	}
	public boolean isSavedUserIdFlg() {
		return savedUserIdFlg;
	}
	public void setSavedUserIdFlg(boolean savedUserIdFlg) {
		this.savedUserIdFlg = savedUserIdFlg;
	}
	public UserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}
	public void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}
	public UserInfoDTO getUserInfoDTO() {
		return userInfoDTO;
	}
	public void setUserInfoDTO(UserInfoDTO userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}
	public CartInfoDAO getCartInfoDAO() {
		return cartInfoDAO;
	}
	public void setCartInfoDAO(CartInfoDAO cartInfoDAO) {
		this.cartInfoDAO = cartInfoDAO;
	}
	public List<String> getUserIdErrorMessageList() {
		return userIdErrorMessageList;
	}
	public void setUserIdErrorMessageList(List<String> userIdErrorMessageList) {
		this.userIdErrorMessageList = userIdErrorMessageList;
	}
	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}
	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}
}