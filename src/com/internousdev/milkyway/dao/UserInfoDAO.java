package com.internousdev.milkyway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.milkyway.dto.UserInfoDTO;
import com.internousdev.milkyway.util.DBConnector;

public class UserInfoDAO {

	public int createUser(String familyName, String firstName, String familyNameKana,
			String firstNameKana, String sex, String email, String userId, String password) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana, first_name_kana,"
				+ "sex, email, status, logined, regist_date, update_date) VALUES(?,?,?,?,?,?,?,?,?,?,now(), now())";
		int count = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ps.setString(3, familyName);
			ps.setString(4, firstName);
			ps.setString(5, familyNameKana);
			ps.setString(6, firstNameKana);
			ps.setString(7, sex);
			ps.setString(8, email);
			ps.setInt(9, 0);
			ps.setInt(10, 1);
			count = ps.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return count;
	}

	public boolean isExistsUserInfo(String userId, String password) {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		boolean result = false;
		String sql = "select count(*) as count from user_info where user_id=? and password=?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				if (resultSet.getInt("count") > 0) {
					result = true;
				}
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

		return result;
	}

	public boolean isExistsUserInfo(String userId) {

		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		boolean result = false;
		String sql = "select count(*) as count from user_info where user_id=?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				if (resultSet.getInt("count") > 0) {
					result = true;
				}
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

		return result;
	}

	public UserInfoDTO getUserInfoDTO(String userId) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		UserInfoDTO dto = new UserInfoDTO();

		String sql = "SELECT * FROM user_info where user_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				dto.setId(rs.getInt("id"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setSex(rs.getInt("sex"));
				dto.setEmail(rs.getString("email"));
				dto.setLogined(rs.getBoolean("logined"));

				if(rs.getString("user_id") != null) {
					dto.setLogined(true);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return dto;
	}

	public int resetPassword(String userId, String password) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "update user_info set password=?, update_date=now() where user_id=?";
		int result = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, password);
			ps.setString(2, userId);

			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}