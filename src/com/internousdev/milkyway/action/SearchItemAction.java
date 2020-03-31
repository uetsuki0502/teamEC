package com.internousdev.milkyway.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.MCategoryDAO;
import com.internousdev.milkyway.dao.ProductInfoDAO;
import com.internousdev.milkyway.dto.MCategoryDTO;
import com.internousdev.milkyway.dto.ProductInfoDTO;
import com.internousdev.milkyway.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware {
	private String productName;
	private int categoryId;
	private List<String> stringList;
	private Map<String, Object> session;
	private List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
	private String[] productNameList;

	public String execute() throws SQLException {
		// カテゴリーの選択肢が存在しない場合は、すべてのカテゴリーを設定する
		if (categoryId < 1) {
			categoryId = 1;
		}
		if (StringUtils.isBlank(productName)) {
			ProductInfoDAO productInfoDAO = new ProductInfoDAO();
			productName = "";
			productInfoDTOList = productInfoDAO.getProductInfoCategory(categoryId);
		} else {
			//検索ワードが入力されていた場合は、入力チェックを行う
			InputChecker inputChecker = new InputChecker();
			stringList = inputChecker.doCheck("検索ワード", productName, 0, 50, true, true, true, true, true, true);
			if (stringList.isEmpty()) {
				//検索ワード変換(全角スペースを半角スペースに変換、2個以上の半角スペースを1個の半角スペースに変換、先頭と末尾のスペースを削除）
				productName = productName.replaceAll("　", " ");
				productName = productName.replaceAll("\\s{2,}", " ");
				productName = productName.trim();
				//分割した検索ワードそれぞれをListに入れる
				productNameList = productName.split(" ");
				ProductInfoDAO productInfoDAO = new ProductInfoDAO();
				//カテゴリーIDを検索するかどうかのメソッド分岐
				if (categoryId == 1) {
					productInfoDTOList = productInfoDAO.getProductInfo(productNameList);
				} else {
					productInfoDTOList = productInfoDAO.getProductInfoInCategory(categoryId, productNameList);
				}
			}
		}
		// カテゴリーのリストを作成する
		if (!session.containsKey("mCategoryDTOList")) {
			List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			mCategoryDTOList = mCategoryDAO.getMCategoryList();
			session.put("mCategoryDTOList", mCategoryDTOList);
		}
		return SUCCESS;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<ProductInfoDTO> getProductInfoDTOList() {
		return productInfoDTOList;
	}

	public void setProductInfoDTOList(List<ProductInfoDTO> productInfoDTOList) {
		this.productInfoDTOList = productInfoDTOList;
	}

	public String[] getProductNameList() {
		return productNameList;
	}

	public void setProductNameList(String[] productNameList) {
		this.productNameList = productNameList;
	}
}
