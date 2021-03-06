package com.ariba.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.ariba.training.dal.ReviewRepository;
import com.ariba.training.domain.Product;
import com.ariba.training.domain.Review;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewRepository dao;
	
	
	@Autowired
	ProductService service;
	
	@PostMapping("/reviews")
	public ResponseEntity<Review> addReview(@RequestBody Review r){
		int productId = r.getProductId();
	
		try {
			Product p = service.getById(productId);
			if(p.getId() == -1)
			{
				// logic to store review in alternate able
				return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}else {
				Review saved = dao.save(r);
				return new ResponseEntity<Review>(saved, HttpStatus.CREATED);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}