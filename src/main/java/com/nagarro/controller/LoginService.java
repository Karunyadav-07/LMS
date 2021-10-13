package com.nagarro.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.model.users;

/*
@Repository
public interface LoginService extends JpaRepository<users,Integer>{

   
	
	
	
}
*/
@Repository
public interface LoginService{

	public users login(users user);
	
	
	
}