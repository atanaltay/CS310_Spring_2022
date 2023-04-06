package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sabanciuniv.model.Supplier;

public interface SupplierRepo extends MongoRepository<Supplier, String>{
	
	public List<Supplier> findByNameLikeIgnoreCase(String name);
	
	
	@Query("{'address.city':?0}")
	public List<Supplier> findSuppliersByCity(String city);
	

	@Query("{'address.city':?0,'name':?1}")
	public List<Supplier> findSuppliersByCityAndName(String city, String name);
	

}
