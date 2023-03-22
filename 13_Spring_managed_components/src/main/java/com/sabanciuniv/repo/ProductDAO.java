package com.sabanciuniv.repo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.sabanciuniv.model.Product;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//DAO
@Repository
public class ProductDAO {

	List<Product> prods = new ArrayList<>();
	
	Logger logger = LoggerFactory.getLogger(ProductDAO.class);
	
	@PostConstruct
	public void init() {
		logger.info("Post construct");
		prods.add(new Product("TV", 1000));
		prods.add(new Product("Mouse", 100));
		prods.add(new Product("Laptop", 2000));
	}
	
	
	public List<Product> findAll(){
			

		return prods;
		
		
	}
	
	
	
	public void save(Product p){
		prods.add(p);
	}
	
	@PreDestroy
	public void destroy() {
		logger.info("Destroy called...");
	}
	
}
