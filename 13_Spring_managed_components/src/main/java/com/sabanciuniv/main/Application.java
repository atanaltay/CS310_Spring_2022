package com.sabanciuniv.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sabanciuniv.model.Product;
import com.sabanciuniv.service.ShopService;

@SpringBootApplication(scanBasePackages = {"com.sabanciuniv.repo","com.sabanciuniv.service"})
public class Application implements CommandLineRunner{

	@Autowired ShopService srv;
	
	Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
			
		//System.out.println("output with system out...");
		
				logger.info("Welcome to Spring Boot Application...");
				
				
				//ProductDAO productDAO =  ctx.getBean(ProductDAO.class);
				
				//productDAO.findAll().forEach(p->logger.info(p.getName()));
				

				srv.getAllProducts().forEach(p->logger.info(p.getName()));
				
				logger.info("----------------");
				
				srv.saveProduct(new Product("Prod 100", 1000));
				
				srv.getAllProducts().forEach(p->logger.info(p.getName()));
		
		
		
	}

}
