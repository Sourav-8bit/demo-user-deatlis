package com.example.forpractice.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.forpractice.demo.model.User;
import com.example.forpractice.demo.repo.UserRepo;

@Service
public class UserService {	
	

	@Autowired
	private UserRepo userRepo;
	
	public List<User> getUsers() {
		List<User> user = new ArrayList<>();    
		userRepo.findAll().forEach(user::add);    
		return user;    
		
		
	}

	public User addUser(User user) {
		User u=userRepo.save(user);
		
		return u;
		//System.out.println(usr.getName());
		//return null;
	}

}
