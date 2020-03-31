package com.internousdev.milkyway.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.milkyway.dto.PurchaseHistoryInfoDTO;
import com.internousdev.milkyway.util.DBConnector;
public class PurchaseHistoryInfoDAO {

	public List<PurchaseHistoryInfoDTO> getMyPageUserInfo
	(String user_id){
		//DBから購入履歴を取得する
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList=new ArrayList<PurchaseHistoryInfoDTO>();

		//SELECT文でテーブル内のカラムを抽出
		String sql="SELECT"
				+ " phi.id as id," /* ID */
				+ " phi.user_id as user_id," /* ユーザーID */
				+ " phi.product_count as product_count," /* 個数 */
				+ " pi.product_id as product_id," /* 商品ID */
				+ " pi.product_name as product_name," /*商品名*/
				+ " pi.product_name_kana as product_name_kana," /* 商品名かな */
				+ " pi.product_description as product_description," /* 商品詳細 */
				+ " pi.category_id as category_id," /* カテゴリID */
				+ " pi.image_file_name as image_file_name," /* 画像ファイルパス */
				+ " pi.image_file_path as image_file_path," /* 画像ファイル名 */
				+ " pi.release_company," /* 発売会社名 */
				+ " pi.release_date," /* 発売年月日 */
				+ " phi.price as price," /* 値段 */
				+ " phi.price * phi.product_count as subtotal," /* 合計金額 */
				+ " phi.regist_date as regist_date," /* 登録日 */
				+ " di.family_name as family_name," /* 姓 */
				+ " di.first_name as first_name," /* 名 */
				+ " di.user_address as user_address" /* 住所 */
				+ " FROM purchase_history_info as phi"
				+ " LEFT JOIN product_info as pi"
				+ " ON phi.product_id = pi.product_id"
				+ " LEFT JOIN destination_info as di"
				+ " ON phi.destination_id = di.id"
				+ " WHERE phi.user_id = ?"
				+ " ORDER BY regist_date DESC";

		//上で作成したSELECT文の実行準備
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user_id);
			ResultSet rs=ps.executeQuery();

			//データの情報があるか確かめる
			while(rs.next()) {
				PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setPrice(rs.getInt("price"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setSubtotal(rs.getInt("subtotal"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setUserAddress(rs.getString("user_address"));
				purchaseHistoryInfoDTOList.add(dto);
			}
		} catch(Exception e){
				e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}finally {
			    try {
			        con.close();
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
			}
		}
		return purchaseHistoryInfoDTOList;
	}

	public int regist(String userId, String productId, String productCount, int destinationId, String price) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "insert into purchase_history_info "
				+ " (user_id, product_id, product_count, price, destination_id, regist_date, update_date) "
				+ " values (?, ?, ?, ?, ?, now(), now())";
		int count = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, productId);
			preparedStatement.setString(3, productCount);
			preparedStatement.setString(4, price);
			preparedStatement.setInt(5, destinationId);
			count = preparedStatement.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	//購入履歴の削除をするためのメソッド(ユーザーID)
	public int buyItemHistoryDelete(String userId) {
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		//SELECT文で削除したい情報を抽出
		String sql="DELETE FROM purchase_history_info "
				+ " WHERE user_id = ?";

		//上で作成したSELECT文の実行準備
		int result=0;
		try {
			PreparedStatement ps;
			ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			result=ps.executeUpdate();
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
}
