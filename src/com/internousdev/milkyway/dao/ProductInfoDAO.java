package com.internousdev.milkyway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.milkyway.dto.ProductInfoDTO;
import com.internousdev.milkyway.util.DBConnector;

public class ProductInfoDAO {

	//カテゴリーIDなしの検索メソッド
	public List<ProductInfoDTO> getProductInfo(String[] productName) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTO = new ArrayList<ProductInfoDTO>();
		String sql = "SELECT product_id,product_name,product_name_kana,price,image_file_path,image_file_name FROM product_info";
		//キーワード1つ毎に部分一致するデータを持ってくるSQL文を足していく条件式
		if (!"".equals(productName[0])) {
			for (int i = 0; i < productName.length; i++) {
				if (i == 0) {
					sql += " WHERE (product_name like '%" + productName[i] + "%' OR product_name_kana LIKE '%"+ productName[i] + "%')";
				} else {
					sql += " OR (product_name like '%" + productName[i] + "%' OR product_name_kana LIKE '%"+ productName[i] + "%')";
				}
			}
		}
		//productID順にする
		sql += " ORDER BY product_id ASC";
		//例外処理とデータセット
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setPrice(rs.getString("price"));
				dto.setImageFile(rs.getString("image_file_path") + rs.getString("image_file_name"));
				productInfoDTO.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTO;
	}

	//カテゴリーID込みの検索メソッド
	public List<ProductInfoDTO> getProductInfoInCategory(int categoryId, String[] productName) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTO = new ArrayList<ProductInfoDTO>();
		//categoryidが一致するデータを持ってくるSQL文
		String sql = "SELECT product_id,product_name,product_name_kana,price,image_file_path,image_file_name FROM product_info WHERE category_id = "+ categoryId;
		//キーワード1つ毎にSQL文を足していく条件式
		if (!"".equals(productName[0])) {
			for (int i = 0; i < productName.length; i++) {
				if (i == 0) {
					sql += " AND (product_name LIKE '%" + productName[i] + "%' or product_name_kana LIKE '%"+ productName[i] + "%'";
				} else {
					sql += ") OR (category_id = " + categoryId + " AND (product_name LIKE '%" + productName[i]+ "%' or product_name_kana LIKE '%" + productName[i] + "%')";
				}
			}
			sql += ")";
		}
		//productID順にする
		sql += " ORDER BY product_id ASC";
		//例外処理とデータセット
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setPrice(rs.getString("price"));
				dto.setImageFile(rs.getString("image_file_path") + rs.getString("image_file_name"));
				productInfoDTO.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTO;
	}

	//カテゴリーIDだけの検索メソッド
	public List<ProductInfoDTO> getProductInfoCategory(int categoryId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTO = new ArrayList<ProductInfoDTO>();
		//categoryidが一致するデータを持ってくるSQL文
		String sql = "SELECT product_id,product_name,product_name_kana,price,image_file_path,image_file_name FROM product_info";
		if (categoryId != 1) {
			sql += " WHERE category_id = " + categoryId;
		}
		//productID順にする
		sql += " ORDER BY product_id ASC";
		//例外処理とデータセット
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setPrice(rs.getString("price"));
				dto.setImageFile(rs.getString("image_file_path") + rs.getString("image_file_name"));
				productInfoDTO.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTO;
	}

	//商品IDで情報を取り出すメソッド
	public ProductInfoDTO getProductInfoId(String productId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ProductInfoDTO productInfoDTO = new ProductInfoDTO();
		//product_idが一致するデータを持ってくるSQL文
		String sql = "SELECT * FROM product_info WHERE product_id=?";
		//例外処理とデータセット
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, productId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setId(rs.getString("id"));
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setCategoryId(rs.getString("category_id"));
				dto.setPrice(rs.getString("price"));
				dto.setImageFile(rs.getString("image_file_path") + rs.getString("image_file_name"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setStatus(rs.getString("status"));
				dto.setRegistDate(rs.getString("regist_date"));
				dto.setUpdateDate(rs.getString("update_date"));
				productInfoDTO = dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTO;
	}

	//関連情報を3つまで取り出すメソッド
	public List<ProductInfoDTO> getProductInfoRelation(String categoryId, String productId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTO = new ArrayList<ProductInfoDTO>();
		//productIdが一致するもの以外でcategoryIdが一致するものをランダムで3つのデータを持ってくるSQL文
		String sql = "SELECT * FROM product_info WHERE category_id = ? AND product_id NOT IN(?) ORDER BY RAND() LIMIT 3";
		//例外処理とデータセット
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, categoryId);
			ps.setString(2, productId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setId(rs.getString("id"));
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setCategoryId(rs.getString("category_id"));
				dto.setPrice(rs.getString("price"));
				dto.setImageFile(rs.getString("image_file_path") + rs.getString("image_file_name"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setStatus(rs.getString("status"));
				dto.setRegistDate(rs.getString("regist_date"));
				dto.setUpdateDate(rs.getString("update_date"));
				productInfoDTO.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTO;
	}
}
