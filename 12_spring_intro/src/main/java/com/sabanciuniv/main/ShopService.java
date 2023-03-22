package com.sabanciuniv.main;

import java.util.List;

public class ShopService {

	
	private ProductDAO productDAO;

	public ShopService(ProductDAO productDAO) {
		super();
		this.productDAO = productDAO;
	}
	
	public void saveProduct(Product p) {
		productDAO.save(p);
	}
	
	public List<Product> getAllProducts(){
		
		return productDAO.findAll();
		
		
	}
	
	
	
	
}
