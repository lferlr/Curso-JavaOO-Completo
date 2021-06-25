package util;

public class ProductSobrecarga {
	public String name;
	public double price;
	public int quantity;
	
	public ProductSobrecarga() {
	}
	
	public ProductSobrecarga(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductSobrecarga(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
