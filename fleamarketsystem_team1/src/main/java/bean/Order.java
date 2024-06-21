package bean;

//コメント　石井
//追記：6月21日11:00分ごろに石井がコードを追加しました。
//変更点は「注文番号」「取引状況」「入金状況」「発送状況」の
//フィールド変数、コンストラクタ、get set メソッドを追加しました。

//コメント　石井
//追記:６月２１日13:30ごろにコードを追加したある部分がいらないことに気づいたので
//「入金状況」「発送状況」のフィールド変数、コンストラクタ、get set メソッドを削除してください。


/**
 * 注文情報（オーダーNo、ユーザーID、書籍のISBN、購入する書籍数、購入日付）を 一つのオブジェクトとしてまとめるためのDTOクラス
 *
 * @author KandaITSchool
 *
 */
public class Order {
	
	//注文番号
	private int order_no;

	/**
	 * 購入するユーザーのID
	 */
	private String userid;
	
	//購入する商品のID
	private String productid;
	
	//購入する商品数
	private int quantity;
	
	/**
	 * 取引状況
	 */
	private String dealing;
	/**
	 * 売上日
	 */
	private String solddate;
	
	//入金状況
	private String deposit;
	
	//発送状況
	private String shipment;

	/**
	 * コンストラクタ<br>
	 * 注文情報（商品ID、ユーザーID、商品数、売上日）の初期設定をおこなう
	 */
	public Order() {
		this.order_no = 0 ;
		this.userid = null;
		this.productid = null ;
		this.quantity = 0 ;
		
		this.dealing = null;
		this.solddate = null;
		this.deposit = null;
		this.shipment = null;
	}
	
	
	//get set メソッド
	//注文番号
	public int getOrder_no() {
		return order_no;
	}
	
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	/**
	 * 購入するユーザーのIDを取得する
	 *
	 * @return 購入するユーザーのID
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 購入するユーザーのIDを設定する
	 *
	 * @param userid
	 *            設定するユーザーID
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	//商品ID
	public String getProductid() {
		return productid ;
	}
	
	public void setProductid(String productid) {
		this.productid = productid ;
	}

	//購入商品数
	
	public int getQuantity() {
		return quantity ;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity ;
	}

	
	//取引状況
	
	public String getDealing() {
		return dealing ;
	}
	
	public void setDealing(String dealing) {
		this.dealing = dealing ;
	}
	
	/**
	 * 売上日付を取得する
	 *
	 * @return 売上日付
	 */
	public String getSolddate() {
		return solddate;
	}

	/**
	 * 購入日付を設定する
	 *
	 * @param date
	 *            設定する購入日付
	 */
	public void setSolddate(String solddate) {
		this.solddate = solddate;
	}
	
	//入金状況
	public String getDeposit() {
		return deposit ;
	}
	
	public void setDeposit(String deposit) {
		this.deposit = deposit ;
	}
	
	//発送状況
	public String getShipment() {
		return shipment ;
	}
	
	public void setShipment(String shipment) {
		this.shipment = shipment ;
	}
	
	
}
