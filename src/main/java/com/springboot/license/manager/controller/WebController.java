package com.springboot.license.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	
	@GetMapping({ "/", "/index" })
	String homePage() {
		return "index";
	}
	
	@GetMapping({ "/list" })
	String listPage() {
		return "index2";
	}
	
	
	


}
