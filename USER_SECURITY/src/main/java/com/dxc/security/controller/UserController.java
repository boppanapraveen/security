package com.dxc.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@GetMapping
	@RequestMapping("/")
	@CrossOrigin("http://localhost:4200")
	public String  homePage() {
		
		
		return "user.jsp";
		
		
		
	}
	
	
	
	
	
	

}
