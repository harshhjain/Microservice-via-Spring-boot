package com.ariba.training.dal;

import java.util.List;

import com.ariba.training.domain.Product;

public interface ProductDAO {
	
	public Product save(Product toBeSaved);
	public Product findById(int id);
	public List<Product> findAll();
	public void deleteById(int id);
}
