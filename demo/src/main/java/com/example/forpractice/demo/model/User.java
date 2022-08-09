package com.example.forpractice.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserDetail usr;
	
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, UserDetail usr, String password) {
		super();
		this.id = id;
		this.usr = usr;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserDetail getUsr() {
		return usr;
	}
	public void setUsr(UserDetail usr) {
		this.usr = usr;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", usr=" + usr + ", password=" + password + "]";
	}
	
	
	

}
