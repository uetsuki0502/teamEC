package com.internousdev.milkyway.action;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationConfirmAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String userAddress;
	private String telNumber;
	private String eMail;

	private List<String> familyNameErrorMessageList;
	private List<String> firstNameErrorMessageList;
	private List<String> familyNameKanaErrorMessageList;
	private List<String> firstNameKanaErrorMessageList;
	private List<String> userAddressErrorMessageList;
	private List<String> telNumberErrorMessageList;
	private List<String> eMailErrorMessageList;

	private Map<String, Object> session;

	public String execute() {

		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined)? 0 : Integer.parseInt(tempLogined);
		if(logined != 1) {
			return "loginError";
		}

		String result = ERROR;

		//住所がスペースのみでも登録ができてしまうのは良くないため
		//スペースのみ入力されている場合はエラーが起こる
		String tempUserAddress = null;
		if (StringUtils.isBlank(userAddress) && !"".equals(userAddress)){
			tempUserAddress = "@@@";
		} else {
			tempUserAddress = userAddress;
		}
		//入力された宛先情報を格納する
		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("userAddress", userAddress);
		session.put("telNumber", telNumber);
		session.put("eMail", eMail);

		//入力された宛先情報の入力チェックを行う
		InputChecker inputChecker = new InputChecker();
			familyNameErrorMessageList = inputChecker.doCheck("姓", familyName, 1, 16, true, true, true, false, true, false);
			firstNameErrorMessageList = inputChecker.doCheck("名", firstName, 1, 16, true, true, true, false, true, false);
			familyNameKanaErrorMessageList = inputChecker.doCheck("姓ふりがな", familyNameKana, 1, 16, false, false, true, false, false, false);
			firstNameKanaErrorMessageList = inputChecker.doCheck("名ふりがな", firstNameKana, 1, 16, false, false, true, false, false, false);
			userAddressErrorMessageList = inputChecker.doCheck("住所", tempUserAddress, 10, 50, true, true, true, true, true, true);
			telNumberErrorMessageList = inputChecker.doCheck("電話番号", telNumber, 10, 13, false, false, false, true, false, false);
			eMailErrorMessageList = inputChecker.doCheckForEmail(eMail);
			//未入力チェックを行う
			if(familyNameErrorMessageList.size() > 0
			|| firstNameErrorMessageList.size() > 0
			|| familyNameKanaErrorMessageList.size() > 0
			|| firstNameKanaErrorMessageList.size() > 0
			|| userAddressErrorMessageList.size() > 0
			|| telNumberErrorMessageList.size() > 0
			|| eMailErrorMessageList.size() > 0 ){

				result = ERROR;
		} else {
				result = SUCCESS;
		}

		return result;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public List<String> getFamilyNameErrorMessageList() {
		return familyNameErrorMessageList;
	}

	public void setFamilyNameErrorMessageList(List<String> familyNameErrorMessageList) {
		this.familyNameErrorMessageList = familyNameErrorMessageList;
	}

	public List<String> getFirstNameErrorMessageList() {
		return firstNameErrorMessageList;
	}

	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList) {
		this.firstNameErrorMessageList = firstNameErrorMessageList;
	}

	public List<String> getFamilyNameKanaErrorMessageList() {
		return familyNameKanaErrorMessageList;
	}

	public void setFamilyNameKanaErrorMessageList(List<String> familyNameKanaErrorMessageList) {
		this.familyNameKanaErrorMessageList = familyNameKanaErrorMessageList;
	}

	public List<String> getFirstNameKanaErrorMessageList() {
		return firstNameKanaErrorMessageList;
	}

	public void setFirstNameKanaErrorMessageList(List<String> firstNameKanaErrorMessageList) {
		this.firstNameKanaErrorMessageList = firstNameKanaErrorMessageList;
	}

	public List<String> geteMailErrorMessageList() {
		return eMailErrorMessageList;
	}

	public void seteMailErrorMessageList(List<String> eMailErrorMessageList) {
		this.eMailErrorMessageList = eMailErrorMessageList;
	}

	public List<String> getTelNumberErrorMessageList() {
		return telNumberErrorMessageList;
	}

	public void setTelNumberErrorMessageList(List<String> telNumberErrorMessageList) {
		this.telNumberErrorMessageList = telNumberErrorMessageList;
	}

	public List<String> getUserAddressErrorMessageList() {
		return userAddressErrorMessageList;
	}

	public void setUserAddressErrorMessageList(List<String> userAddressErrorMessageList) {
		this.userAddressErrorMessageList = userAddressErrorMessageList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}