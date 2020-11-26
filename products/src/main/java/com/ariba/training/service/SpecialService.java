package com.ariba.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ariba.training.dal.ProductDAO;

@Service
public class SpecialService {
	
	@Autowired
	@Qualifier("productDAOInMemImpl")
	ProductDAO dao;

}