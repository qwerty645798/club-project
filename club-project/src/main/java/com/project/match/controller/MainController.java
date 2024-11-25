package com.project.match.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.match.service.UserService;

@Controller
public class MainController {

	private final UserService userService;
	
	public MainController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/")
	public String home () {
		return "home";
	}
	
	
}
