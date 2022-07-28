package com.mahir;

import java.util.Arrays;

public class DepartmentStore {

	private String storeName;
	private String address;
	private Product[] productList=new Product[500];
	private int numberOfProducts;

	DepartmentStore()
	{
		storeName="DepartmentStore";
		address="Dhaka";
		this.numberOfProducts=0;
	}
	DepartmentStore(String storeName, String address)
	{
		this.storeName=storeName;
		this.address=address;	
		this.numberOfProducts=0;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	

	public int getNumberOfProducts() {
		return numberOfProducts;
	}
	public void setNumberOfProducts(int numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}
	public String toString() {
		return "DepartmentStore [storeName=" + storeName + ", address=" + address + ", productList="
				+ Arrays.toString(productList) + ", numberOfProducts=" + numberOfProducts + "]";
	}


	public void addProduct(Product product)
	{
		productList[numberOfProducts++]=product;
	}
	public void removeProduct(Product product)
	{
		int ind=getIndex(product);
		if(ind>=0)
		{
			for(int i=ind;i<numberOfProducts-1;i++)
			{
				productList[i]=productList[i+1];
			}
			productList[numberOfProducts-1]=null;
			numberOfProducts--;
			System.out.println("Product Deleted.");
		}
		else
			System.out.println("Product doesn't exist");
	}

	public int getIndex(Product product)
	{
		for(int i=0;i<numberOfProducts;i++)
		{
			if(productList[i].toString().equals(product.toString()))
			{
				return i;
			}			
		}
		return -1;
	}

	public void displayProduct()
	{		
		for(int i=0;i<numberOfProducts;i++)
		{			
			System.out.println(productList[i].toString());		
		}
	}


	public void searchProduct(Product product)
	{
		boolean flag=true;
		for(int i=0;i<numberOfProducts;i++)
		{
			if(productList[i].toString().equals(product.toString()))
			{
				System.out.println(productList[i].toString());
				flag=false;
				break;
			}

		}
		if(flag==true)
			System.out.println("Product not found");
	}


}
