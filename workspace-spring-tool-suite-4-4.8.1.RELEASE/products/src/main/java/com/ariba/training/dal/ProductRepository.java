package com.ariba.training.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.ariba.training.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	public List<Product> findByName(String s);
	public List<Product> findByPrice(float p);
	
	@Query("select p from Product as p where p.qoh<:qty")
	public List<Product> myComplexQuery(@Param("qty")int q);

}
