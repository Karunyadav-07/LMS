package com.nagarro.controller;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import com.nagarro.model.*;


public  class LoginServiceImpl implements LoginService{

	public users login(users user) {
		
		RestTemplate resttemplate = new RestTemplate();
		String url = "http://localhost:8081/checklogin";
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Object> entity = new HttpEntity(user,headers);
		
		ResponseEntity<users> result = resttemplate.exchange(url,HttpMethod.POST,entity,users.class);
		users logged = result.getBody();
		return logged;
	}
	
}
