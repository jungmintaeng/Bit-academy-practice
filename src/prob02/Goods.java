package prob02;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	
	/**
	 * Constructor
	 */
	public Goods() {
		
	}
	
	public Goods(String name, int price, int countStock) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
	}
	
	/**
	 * getter - setter
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	
	/**
	 * methods
	 */
	public void show() {
		System.out.println(this + " 입고 되었습니다.");
	}
	
	@Override
	public String toString() {
		return name + "(가격:" + price + "원)이 " + countStock + "개";
	}
}