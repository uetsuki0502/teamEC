package com.internousdev.milkyway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.milkyway.dto.CartInfoDTO;
import com.internousdev.milkyway.util.DBConnector;

public class CartInfoDAO {

	/*（ユーザーIDと商品IDと個数を引数にする）
	 * カートに商品を追加するメソッド ユーザーIDと商品IDに紐づく情報があれば、そこにproductCountを足す
	 * 紐づく情報が無ければ新規で登録する
	 * 成功したらint型で１以上を返す
	 */

	public int addCart(String userId, String productId, int productCount) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		String sql = "select * from cart_info where user_id = ? and product_id = ?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, productId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int newProductCount = productCount + rs.getInt("product_count");
				sql = "update cart_info set product_count = ?, update_date = now() where user_id = ? and product_id = ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, newProductCount);
				ps.setString(2, userId);
				ps.setString(3, productId);
				result = ps.executeUpdate();
			}

			if(result < 1) {
				sql = "insert into cart_info(user_id, product_id, product_count, regist_date, update_date) values(?,?,?,now(),now())";
				ps = con.prepareStatement(sql);
				ps.setString(1, userId);
				ps.setString(2, productId);
				ps.setInt(3, productCount);
				result = ps.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result; //登録が成功していれば１以上を返す
	}

	//ユーザーIDを引数にカートの情報を返すメソッド（戻り値で配列を返す）
	public List<CartInfoDTO> getCartList(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<CartInfoDTO> cartInfoDTOList = new ArrayList<CartInfoDTO>();

		String sql = "select ci.product_id as product_id,pi.product_name as product_name, "
				+ "pi.product_name_kana as product_name_kana,pi.image_file_path as image_file_path, "
				+ "pi.image_file_name as image_file_name,pi.price as price, "
				+ "pi.release_company as release_company,pi.release_date as release_date, "
				+ "ci.product_count as product_count,ci.update_date as update_date,"
				+ "ci.regist_date as regist_date "
				+ "from cart_info as ci left join product_info as pi "
				+ "on ci.product_id = pi.product_id "
				+ "where ci.user_id = ? order by update_date desc, regist_date desc";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				CartInfoDTO dto = new CartInfoDTO();
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFile(rs.getString("image_file_path")+rs.getString("image_file_name"));
				dto.setPrice(rs.getString("price"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setProductCount(rs.getString("product_count"));
				dto.setTotalPrice(rs.getInt("product_count") * rs.getInt("price"));
				cartInfoDTOList.add(dto);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cartInfoDTOList; //カートの情報を返す
	}

	//カート情報を削除するメソッド　ユーザーIDとカート画面で＃チェックが入った商品IDを引数にする
	public int deleteCartList(String userId, String productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;

		String sql = "delete from cart_info where user_id=? and product_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, productId);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result; //成功していれば１を返す
	}

	//①仮ユーザーIDに紐づくカート情報が存在するかチェック　存在すればtrue しなければfalseを返す
	public boolean confirmCartInfo(String kariUserId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean boo = false;
		String sql = "select * from cart_info where user_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, kariUserId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				boo = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return boo;
	}

	//②引数にした仮ユーザーIDに紐づく商品IDをlistに格納して返す
	public List<String> selectCartInfo(String kariUserId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<String> productIdList = new ArrayList<>();
		String sql = "select * from cart_info where user_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, kariUserId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				productIdList.add(rs.getString("product_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productIdList;
	}

	//③ユーザーIDと上記で格納された商品IDで紐づくものがあるか調べ、あればtrue,なければfalseを返す
	public boolean searchCartInfo(String userId, String productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean boo = false;
		String sql = "select * from cart_info where user_id = ? and product_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, productId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				boo = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return boo;
	}

	//④　ユーザーIDと仮ユーザーIDの個数を足して、ユーザーIDの個数を更新する。仮ユーザーIDは削除する
	//帰ってきた数字が０なら失敗、１以上なら成功
	public int countupProductId(String userId, String kariUserId, String productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		int newProductCount = 0;
		String sql = "select * from cart_info where user_id = ? and product_id = ? or user_id = ? and product_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, productId);
			ps.setString(3, kariUserId);
			ps.setString(4, productId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				newProductCount += rs.getInt("product_count");
			}
			sql = "update cart_info set product_count = ?, update_date = now() where user_id = ? and product_id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, newProductCount);
			ps.setString(2, userId);
			ps.setString(3, productId);
			result = ps.executeUpdate();
			if(result < 1) {
				return result;
			}
			sql = "delete from cart_info where user_id=? and product_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, kariUserId);
			ps.setString(2, productId);
			result = 0;
			result = ps.executeUpdate();
		} catch (SQLException e) {
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

	//⑤　仮ユーザーIDをユーザーIDに更新する
	public int updateUserId(String userId, String kariUserId, String productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		String sql = "update cart_info set user_id = ?, update_date = now() where user_id = ? and product_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId); //ユーザーID
			ps.setString(2, kariUserId); //仮ユーザーID
			ps.setString(3, productId); //商品ID
			result = ps.executeUpdate();
		} catch (SQLException e) {
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

	//引数にしたユーザーIDに紐づくカート情報を削除するメソッド（成功したら１以上、失敗したら０を返す）
	public int deleteCartList(String user_id) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;

		String sql = "delete from cart_info where user_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result; //成功して入れば１以上を返す
	}

}
