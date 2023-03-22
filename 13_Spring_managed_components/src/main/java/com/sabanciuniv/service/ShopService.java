package com.sabanciuniv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabanciuniv.model.Product;
import com.sabanciuniv.repo.ProductDAO;
 
@Service
public class ShopService {

	@Autowired
	private ProductDAO productDAO;
	
	public void saveProduct(Product p) {
		productDAO.save(p);
	}
	
	public List<Product> getAllProducts(){
		
		return productDAO.findAll();
		
		
	}
	
	
	
	
}
