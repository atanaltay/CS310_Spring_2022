package com.sabanciuniv.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabanciuniv.payload.Message;
import com.sabanciuniv.payload.User;

@RestController
@RequestMapping("/hello")
public class HelloController {

	//GET , POST
	//PUT -> insert operation
	//DELETE -> delete operations
	
	@GetMapping("/sayhello")
	public String hello() {
		return "Hello, welcome to Spring Rest..";
	}
	
	@GetMapping("/sayhelloname/{name}")
	public String helloToName(@PathVariable("name") String name) {
		
		return "Hello  " + name + " from Spring Rest " + " , at " + LocalDateTime.now(); 
		
		
	}
	//  /product/1234
	
	@GetMapping("/sayhelloname/{name}/{lastname}")
	public String helloToNameLastName(@PathVariable("name") String name, @PathVariable("lastname") String lastname) {
		
		return "Hello  " + name +" " +lastname +" from Spring Rest " + " , at " + LocalDateTime.now(); 
		
		
	}
	
	@GetMapping("/sayhellojson/{name}")
	public Message helloJsonRet(@PathVariable("name") String name) {
		
		Message msg = new Message("Your name is " + name, LocalDateTime.now());
		
		return msg;
		
		
	}
	
	@PostMapping("/register")
	public Message registerUser(@RequestBody User userToRegister) {
		
		String name = userToRegister.getUsername();
		
		Message msg = new Message("You are registered: " + name, LocalDateTime.now());
		
		return msg;
	}
	
	
	
}
