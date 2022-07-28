package com.mahir;

public class Test {

	public static void main(String[] args)
	{
		DepartmentStore dStore =new DepartmentStore("All in One Store","New Market, Dhaka");

		Product p1=new Product("product 1", "brand 1", 9, 2, 1001);		
		Product p2=new Product("product 2", "brand 1", 5, 5, 1002);		
		Product p3=new Product("product 3", "brand 2", 10, 3, 1003);		
		Product p4=new Product("product 4", "brand 2", 15, 6, 1004);

		dStore.addProduct(p1);
		dStore.addProduct(p2);
		dStore.addProduct(p3);
		dStore.addProduct(p4);

		//System.out.println(dStore.getNumberOfProducts());
		//dStore.displayProduct();
		dStore.removeProduct(p3);	
		//System.out.println(dStore.getNumberOfProducts());
		//System.out.println("After deleting product 3");		
		//dStore.displayProduct();	


		dStore.searchProduct(p4);

	}


}
