package com.nagarro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.model.users;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService obj;
	
	@RequestMapping("/")
	public String login(){
		return "index";
	}
	
	
	@RequestMapping("/checklogin")
	public ModelAndView checklogin(@RequestParam(name = "uid") String uid,@RequestParam(name = "pass") String pass)
	{
		ModelAndView model = new ModelAndView();
		users user = new users();
		user.setUserId(uid);
		user.setPassword(pass);
	    
		/// TO DO the redirect path of LMS Backend
		
		users returnedUser = this.obj.login(user);
		if(returnedUser == null) {
			model.setViewName("index");
			
		}
		
		return model;
	
		
	}
		
		
		
		
}
