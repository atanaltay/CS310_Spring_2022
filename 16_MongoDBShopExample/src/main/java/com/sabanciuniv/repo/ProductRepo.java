package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sabanciuniv.model.Product;
import com.sabanciuniv.model.Supplier;

public interface ProductRepo extends MongoRepository<Product, String>{
	
	public List<Product> findByName(String name);
	
	public List<Product> findBySupplier(Supplier sup);

}
