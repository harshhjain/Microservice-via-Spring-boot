package com.ariba.training.dal;

import org.springframework.data.repository.CrudRepository;

import com.ariba.training.domain.Review;

public interface ReviewRepository extends CrudRepository<Review, Integer>{

}
