package com.sabanciuniv.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.sabanciuniv.util"})
public class Application implements CommandLineRunner{

	
	
	Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Autowired ApplicationContext ctx;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		//System.out.println("output with system out...");
		
		logger.info("Welcome to Spring Boot Application...");
		
		
		//ProductDAO productDAO =  ctx.getBean(ProductDAO.class);
		
		//productDAO.findAll().forEach(p->logger.info(p.getName()));
		
		ShopService srv =  ctx.getBean(ShopService.class);
		
		srv.getAllProducts().forEach(p->logger.info(p.getName()));
		
		logger.info("----------------");
		
		srv.saveProduct(new Product("Prod 44", 1000));
		
		srv.getAllProducts().forEach(p->logger.info(p.getName()));
		
		
		
	}
	
	//A signleton bean
	@Bean ProductDAO productDAO() {
		
		return new ProductDAO();
		
	}
	
	@Bean ShopService shopService() {
		return new ShopService(productDAO());
	}
	

}
