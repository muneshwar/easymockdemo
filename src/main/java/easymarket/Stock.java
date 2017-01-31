package easymarket;

public class Stock {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	private Integer quantity;
	public Stock(String name, Integer quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	


}
