package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sabanciuniv.model.Friend;

public interface FriendRepo extends MongoRepository<Friend, String>{

	
	public List<Friend> findByName(String name);
	
	
}
