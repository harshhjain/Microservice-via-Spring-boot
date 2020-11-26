package com.ariba.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ariba.training.dal.ProductRepository;
import com.ariba.training.domain.Product;
import com.ariba.training.ui.ProductConsoleUI;

@SpringBootApplication
public class ProductsApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = 
				SpringApplication.run(ProductsApplication.class, args);

		
		testRepo(springContainer);
		
//		ProductConsoleUI ui = springContainer.getBean(ProductConsoleUI.class);
//		ui.createProductWithUI();
	}

	private static void testRepo(ApplicationContext springContainer) {
		ProductRepository repo = springContainer.getBean(ProductRepository.class);
		Product p = new Product("Yo", 100000, 99);
		Product h = new Product("Yo2", 200000, 88);
		repo.save(p);
		repo.save(h);
	}

}