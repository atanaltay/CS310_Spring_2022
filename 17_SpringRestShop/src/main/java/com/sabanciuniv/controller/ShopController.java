package com.sabanciuniv.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabanciuniv.model.Product;
import com.sabanciuniv.model.Supplier;
import com.sabanciuniv.payload.Message;
import com.sabanciuniv.repo.ProductRepo;
import com.sabanciuniv.repo.SupplierRepo;

@RestController
@RequestMapping("/shop")
public class ShopController {

	
	@Autowired ProductRepo prodRepo;
	@Autowired SupplierRepo supRepo;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		
		List<Product> prods = prodRepo.findAll();
		
		return prods;
		

	}
	
	@GetMapping("/products/{name}")
	public List<Product> getProductsByName(@PathVariable("name") String name){
		
		List<Product> prods = prodRepo.findByNameLikeIgnoreCase(name);
		
		return prods;
		
	}
	
	@PostMapping("/save")
	public Message saveSupplier(@RequestBody Supplier supplier) {
		
		try {
			supRepo.insert(supplier);
			return new Message("Supplier is saved!",LocalDateTime.now());
		} catch (Exception e) {
			return new Message("Supplier not saved!",LocalDateTime.now());
		}
		
		
		
	}
	
}
