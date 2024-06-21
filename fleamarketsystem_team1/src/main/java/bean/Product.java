//6/21 17:23 定数・コンストラクタ・メソッドに「入金状況」に関する処理を追加しました。【石井】
package bean;

public class Product {
	//① フィールド変数に定義

	private int productid; //商品ID
	private int userid; //ユーザーID
	private String name; //商品名
	private int price; //商品価格
	private int quantity; //商品個数
	private String description; //商品説明文
	private String selldate; //出品日
	private String deposit_status;//入金状況

	//② コンストラクタ定義

	public Product() {

		this.productid = 0; //商品ID初期化
		this.userid = 0; //ユーザーID初期化
		this.name = null; //商品名初期化
		this.price = 0; //商品価格初期化
		this.quantity = 0; //商品個数初期化
		this.description = null; //商品説明文初期化
		this.selldate = null; //出品日初期化
		this.deposit_status = null;//入金状況初期化

	}

	//③④ 各フィールド変数のGet・setメソッド定義
	//商品ID
	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	//ユーザーID
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	//商品名
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//商品価格
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	 //商品個数
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//商品説明文
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//出品日
	public String getSelldate() {
		return selldate;
	}

	public void setSelldate(String selldate) {
		this.selldate = selldate;
	}

	/入金状況
	public String getdeposit_status() {
		return deposit_status;
	}
	public void setdeposit_status(String deposit_status) {
		this.deposit_status = deposit_status;
	}
}
