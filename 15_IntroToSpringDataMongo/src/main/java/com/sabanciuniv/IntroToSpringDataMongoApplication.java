package com.sabanciuniv;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.sabanciuniv.model.Friend;
import com.sabanciuniv.repo.FriendRepo;

@SpringBootApplication
public class IntroToSpringDataMongoApplication implements CommandLineRunner {

	private static final Logger logger 
	= LoggerFactory.getLogger(IntroToSpringDataMongoApplication.class);
	
	@Autowired FriendRepo friendRepo;
	
	@Autowired MongoTemplate mongoTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringDataMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		long count =  friendRepo.count();		
		
		logger.info("Count of data rows :" + count);
		
		
		if(friendRepo.count()==0) {
			
			Friend f1 = new Friend("mehmet", 1980, "WORK");
			Friend f2 = new Friend("ahmet", 1990, "FAMILY");
			Friend f3 = new Friend("zeynep", 1995, "FAMILY");
			Friend f4 = new Friend("fatma", 1987, "WORK");
			
			
			//Friend frSaved = friendRepo.insert(f1);
			
			//logger.info("Friend is saved + " + frSaved.toString());
			
			
			List<Friend> friendsToSave = new ArrayList<>();
			friendsToSave.add(f1);
			friendsToSave.add(f2);
			friendsToSave.add(f3);
			friendsToSave.add(f4);
			
			
			friendRepo.insert(friendsToSave);
			
			logger.info("Friends saved!!");
			
		}
		
		friendRepo.findAll().forEach(fr->{logger.info(fr.toString());});
		
		logger.info("---------------");
		
		//The second way is using MongoTemplate
		
		Query query = new Query();
		
		mongoTemplate.find(query, Friend.class).forEach(f->{logger.info(f.toString());});;
		
		logger.info("---------------");
		
	 friendRepo.findByName("ahmet")
	 .forEach(f->{logger.info(f.toString());});;
		
		
		
	}

}
