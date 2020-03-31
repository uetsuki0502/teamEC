package com.internousdev.milkyway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.milkyway.dto.DestinationInfoDTO;
import com.internousdev.milkyway.util.DBConnector;

public class DestinationInfoDAO {
	//宛先情報を入力するメソッド
	public int insert(String userId, String familyName, String firstName, String familyNameKana, String firstNameKana,
		 String email, String telNumber, String userAddress) {
		DBConnector db = new DBConnector();
		Connection con=db.getConnection();
		int count = 0;
		//(入力された宛先情報を宛先情報テーブルに登録する)SQL文(ユーザーID,姓、名、姓かな、名かな、メールアドレス、住所、電話番号、登録日時、更新日時)
		String sql = "insert into destination_info "
				+ " (user_id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address, regist_date, update_date) "
				+ " values (?, ?, ?, ?, ?, ?, ?, ?, now(), now())";
		//例外処理とデータセット
		try {
			PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, userId);
					ps.setString(2, familyName);
					ps.setString(3, firstName);
					ps.setString(4, familyNameKana);
					ps.setString(5, firstNameKana);
					ps.setString(6, email);
					ps.setString(7, telNumber);
					ps.setString(8, userAddress);
					count = ps.executeUpdate();

			} catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					con.close();
				}catch(SQLException e) {
						e.printStackTrace();
				}
		}
		return count;
	}

	public List<DestinationInfoDTO> getDestinationInfo(String userId){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		List<DestinationInfoDTO> destinationInfoDTOList=new ArrayList<DestinationInfoDTO>();

		//SELECT文でDBからテーブル内の要素を取得(姓、名、姓かな、名かな、住所、電話番号、メールアドレス)
		String sql="SELECT id,family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, email "
				+ " FROM destination_info "
				+ " WHERE user_id = ?";

		//上のSQL文の実行準備
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()) {
				DestinationInfoDTO dto = new DestinationInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setUserAddress(rs.getString("user_address"));
				dto.setTelNumber(rs.getString("tel_number"));
				dto.setEmail(rs.getString("email"));
				destinationInfoDTOList.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
		    try {
		        con.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
		return destinationInfoDTOList;
	}

	//宛先情報の削除
	public int myPageListDelete(String id) throws SQLException{
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="DELETE FROM destination_info "
				+ " WHERE id=?" ;
		int count=0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			count=ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return count;
	}
}