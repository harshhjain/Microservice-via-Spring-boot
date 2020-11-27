package com.ariba.training.ui;

import java.util.Scanner;

import com.ariba.training.domain.Product;
import com.ariba.training.service.ProductService;
import com.ariba.training.service.ProductServiceImpl;

public class ProductConsoleUI {
	
	ProductService service = new ProductServiceImpl();
	
	public void createProductWithUI() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Name: ");
		String name  = s.nextLine();
		System.out.println("Enter price: ");
		float price = Float.parseFloat(s.nextLine());
		System.out.println("Enter QoH: ");
		int qoh = Integer.parseInt(s.nextLine());
		
		Product p = new Product(name, price, qoh);
		int id = service.addNewProduct(p);
		System.out.println("Added product with Id: "+id);
	}

}
