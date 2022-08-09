package com.example.forpractice.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.forpractice.demo.model.User;
import com.example.forpractice.demo.services.UserService;

@RestController
public class WebController {

	@Autowired
	UserService userService;
	
	@GetMapping("/Users")
	public ResponseEntity<List<User>> getUSer() {
		List<User> u=userService.getUsers();
		
		if(u.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(u));
	}
	
	@PostMapping("/Users")
	public User addUser(@RequestBody User usr) {
		User u=userService.addUser(usr);
		return u;
		//System.out.println("---------------hellooooo------------");
		//return null;
	}
}
