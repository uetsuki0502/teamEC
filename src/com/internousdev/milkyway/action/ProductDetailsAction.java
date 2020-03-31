package com.internousdev.milkyway.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.milkyway.dao.ProductInfoDAO;
import com.internousdev.milkyway.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDetailsAction extends ActionSupport implements SessionAware {
    private String productId;
    private List<ProductInfoDTO> relatedProductList;
    private Map<String, Object> session;
    private ProductInfoDTO productInfoDTO = new ProductInfoDTO();

    public String execute(){

        ProductInfoDAO dao = new ProductInfoDAO();
        //商品ID情報の取得
        productInfoDTO = dao.getProductInfoId(productId);
        if(productInfoDTO.getProductId() == null) {
                productInfoDTO = null;
        } else {
                //関連商品情報の取得
                relatedProductList = dao.getProductInfoRelation(productInfoDTO.getCategoryId(), productInfoDTO.getProductId());
        }

        return SUCCESS;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public List<ProductInfoDTO> getRelatedProductList() {
        return relatedProductList;
    }

    public void setRelatedProductList(List<ProductInfoDTO> relatedProductList) {
        this.relatedProductList = relatedProductList;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public ProductInfoDTO getProductInfoDTO() {
        return productInfoDTO;
    }

    public void setProductInfoDTO(ProductInfoDTO productInfoDTO) {
        this.productInfoDTO = productInfoDTO;
    }
}