package com.internousdev.milkyway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.milkyway.dto.MCategoryDTO;
import com.internousdev.milkyway.util.DBConnector;

public class MCategoryDAO {
	//MCategoryからデータを引っ張ってくるメソッド
	public List<MCategoryDTO> getMCategoryList() {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();
		//データを抽出するSQL文
		String sql = "select * from m_category";
		//例外処理とデータセット
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				MCategoryDTO mCategoryDTO = new MCategoryDTO();
				mCategoryDTO.setId(resultSet.getInt("id"));
				mCategoryDTO.setCategoryId(resultSet.getInt("category_id"));
				mCategoryDTO.setCategoryName(resultSet.getString("category_name"));
				mCategoryDTO.setCategoryDescription(resultSet.getString("category_description"));
				mCategoryDTOList.add(mCategoryDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mCategoryDTOList;
	}
}
