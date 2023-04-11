package com.sabanciuniv;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.sabanciuniv.model.Address;
import com.sabanciuniv.model.Product;
import com.sabanciuniv.model.Supplier;
import com.sabanciuniv.repo.ProductRepo;
import com.sabanciuniv.repo.SupplierRepo;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired SupplierRepo supplierRepo;
	@Autowired ProductRepo productRepo;
	@Autowired MongoTemplate mongoTemplate;
	
	private static final Logger logger 
	= LoggerFactory.getLogger(Application.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//1st way: using MongoRepository
		
		/*
		 * if(supplierRepo.count()==0) {
		 * 
		 * Address add1 = new Address("istanbul","1233"); Supplier sup1 = new
		 * Supplier("Apple",add1);
		 * 
		 * Address add2 = new Address("ankara","1233"); Supplier sup2 = new
		 * Supplier("Samsung",add2);
		 * 
		 * 
		 * Address add3 = new Address("istanbul","1233"); Supplier sup3 = new
		 * Supplier("Sony",add3);
		 * 
		 * List<Supplier> supps = new ArrayList<>();
		 * 
		 * supps.add(sup1); supps.add(sup2); supps.add(sup3);
		 * 
		 * supplierRepo.insert(supps);
		 * 
		 * logger.info("Suppliers saved!");
		 * 
		 * 
		 * }
		 * 
		 * if(productRepo.count()==0) { //Accessing the supplier: //Supplier sup = new
		 * Supplier(); //sup.setId("642d72d06f137d4a76f01079");
		 * 
		 * 
		 * //or query for the supplier
		 * 
		 * 
		 * Supplier apple = supplierRepo.findByNameLikeIgnoreCase("ap").get(0); Supplier
		 * samsung = supplierRepo.findByNameLikeIgnoreCase("sam").get(0); Supplier sony
		 * = supplierRepo.findByNameLikeIgnoreCase("son").get(0);
		 * 
		 * 
		 * Product p1= new Product("Mouse",100,200,apple); Product p2= new
		 * Product("Keyboard",120,300,apple); Product p3= new
		 * Product("TV",1000,5000,samsung); Product p4= new
		 * Product("Cable",100,20,sony); Product p5= new
		 * Product("Tablet",300,2000,sony); Product p6= new
		 * Product("Laptop",200,3000,apple);
		 * 
		 * 
		 * List<Product> prods = new ArrayList<>(); prods.add(p1); prods.add(p2);
		 * prods.add(p3); prods.add(p4); prods.add(p5); prods.add(p6);
		 * 
		 * productRepo.insert(prods);
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * supplierRepo.findByNameLikeIgnoreCase("ap")
		 * .forEach(sup->{logger.info(sup.getName());});
		 * 
		 * logger.info("--------------");
		 * 
		 * Product mouse = productRepo.findByName("Mouse").get(0);
		 * logger.info(mouse.getSupplier().getAddress().getCity());
		 * 
		 * 
		 * logger.info("suppliers of istanbul");
		 * 
		 * supplierRepo.findSuppliersByCity("istanbul")
		 * .forEach(sup->{logger.info(sup.getName() + " " +
		 * sup.getAddress().getCity());});
		 * 
		 * logger.info("suppliers of istanbul-apple");
		 * supplierRepo.findSuppliersByCityAndName("istanbul","Apple")
		 * .forEach(sup->{logger.info(sup.getName() + " " +
		 * sup.getAddress().getCity());});
		 */
		
		//2nd way - > using MongoTemplate
		
		
		List<Product> prods = mongoTemplate.findAll(Product.class);
		
		prods.forEach(p->logger.info(p.toString()));
		
		
		logger.info("---------------");
		
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is("Mouse"));
		
		mongoTemplate.find(query, Product.class)
		.forEach(p->logger.info(p.toString()));
		
		logger.info("---------------");
		
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("price").gte(100));
		query2.addCriteria(Criteria.where("stock").gte(100));
		
		mongoTemplate.find(query2, Product.class)
		.forEach(p->logger.info(p.toString()));
		
		logger.info("---------------");
		//case insensitive search
		
		Query query3 = new Query();
		query3.addCriteria(Criteria.where("name").regex("mo","i"));
		
		mongoTemplate.find(query3, Product.class)
		.forEach(p->logger.info(p.toString()));
		
		logger.info("---------------");
		
		//sorting
		
		Query query4 = new Query();
		query4.with(Sort.by(Sort.Direction.ASC,"price"));
		query4.addCriteria(Criteria.where("name").regex("","i"));
		
		mongoTemplate.find(query4, Product.class)
		.forEach(p->logger.info(p.toString()));

	}

}
