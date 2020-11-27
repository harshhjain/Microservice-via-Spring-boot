package com.ariba.training.web;

import org.springframework.stereotype.Service;

import com.ariba.training.domain.Product;

@Service
public class FallbackProductService implements ProductService {

	@Override
	public Product getById(int id) {
		Product p = new Product();
		p.setId(-1);
		return p;
	}

}