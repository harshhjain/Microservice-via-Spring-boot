//package com.ariba.training;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.ariba.training.dal.ProductDAO;
//import com.ariba.training.dal.ProductDAOInMemImpl;
//import com.ariba.training.service.ProductService;
//import com.ariba.training.service.ProductServiceImpl;
//import com.ariba.training.ui.ProductConsoleUI;
//
//@Configuration
//public class ProductsApplicationConfiguration {
//	
//	@Bean
//	public ProductDAO daoObj() {
//		ProductDAOInMemImpl dao= new ProductDAOInMemImpl();
//		return dao;
//	}
//
//	@Bean
//	public ProductService serviceObj() {
//		ProductServiceImpl service = new ProductServiceImpl();
//		service.setDao(daoObj());
//		return service; 
//	}
//	
//	@Bean
//	public ProductConsoleUI uiObj() {
//		ProductConsoleUI ui = new ProductConsoleUI();
//		ui.setService(serviceObj());
//		return ui;
//	}
//}
