package com.mahir;

public class Product {

	private String productName;
	private String brandName;
	private int price;
	private int quantity;
	private int productID;

	Product(){
		productName="Product";
		brandName="Brand";
		price=quantity=productID=0;
	}
	Product(String productName, String brandName, int price, int quantity, int productID){
		this.productName=productName;
		this.brandName =brandName;
		this.price=price;
		this.quantity=quantity;
		this.productID=productID;		
	}


	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String toString() {
		return "Product [productName=" + productName + ", brandName=" + brandName + ", price=" + price + ", quantity="
				+ quantity + ", productID=" + productID + "]";
	}


}
