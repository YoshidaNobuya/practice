public abstract class TangibleAsset {
	private String name;
	private String color;
	private int price;

	//	コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	//	メソッド
	public String getColor() {
		return this.color;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPrice(){
		return this.price;
	}
}
