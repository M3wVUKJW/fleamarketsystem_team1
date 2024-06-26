//作成者　石井　
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.Order;

public class OrderDAO {

	//データベース接続情報
	private static String RDB_DRIVE ="org.mariadb.jdbc.Driver";
	private static String URL ="jdbc:mariadb://localhost/marketdb";
	private static String USER ="root";
	private static String PASS ="root123";

	private static Connection getConnection(){
		try{
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL,USER,PASS);
			return con ;
		}catch(Exception e){
			throw new IllegalStateException(e);
		}
	} 

	//引数の購入データを元にDBのorderinfoテーブルに新規登録処理を行うメソッド
	public void insert(Order order){

		Connection con = null;//DBコネクション
		Statement smt = null;//SQLステートメント

		try{
			//DB接続
			con = getConnection();
			smt = con.createStatement();

			//SQL文作成
			String sql = "INSERT INTO orderinfo VALUES(NULL,'"+ order.getUserid() + "','"+ order.getProductid() + "','"+ order.getQuantity() +"',"
					+ order.getSolddate() +",CURDATE())";
			//SQL文発行
			int count = smt.executeUpdate(sql);

		}catch(Exception e){
			throw new IllegalStateException(e);
		}finally{
			if( smt != null ){
				try{smt.close();}catch(SQLException ignore){}
			}
			if( con != null ){
				try{con.close();}catch(SQLException ignore){}
			}
		}
	}
	
	
	//購入情報の検索を行うメソッド
	public Order selectByUserid(String userid) {

		Connection con = null;//DBコネクション
		Statement smt = null;//SQLステートメント

		Order order = new Order();

		try{
			//DB接続
			con = getConnection();
			smt = con.createStatement();
			//SQL文作成
			String sql  = "SELECT order_no,user_id,product_id,sold_date,dealing,deposit,shipment FROM order_info WHERE user_id = '" + userid + "'";
			//SQL文発行
			ResultSet rs  = smt.executeQuery(sql);

			while(rs.next()) {
				order.setOrder_no(rs.getInt("order_no"));
				order.setUserid(rs.getString("userid"));
				order.setSold_date(rs.getInt("sold_date"));
				order.setDealing(rs.getString("dealing"));
				order.setSolddate(rs.getString("solddate"));
				order.setDeposit(rs.getString("deposit"));
				order.setSold_date(rs.getInt("sold_date"));
				order.setShipment(rs.getString("shipment"));
			}

		}catch(Exception e){
			throw new IllegalStateException(e);
		}finally{
			if( smt != null ){
				try{smt.close();}catch(SQLException ignore){}
			}
			if( con != null ){
				try{con.close();}catch(SQLException ignore){}
			}
		}
		return order;//オブジェクトに返還
	}
}
