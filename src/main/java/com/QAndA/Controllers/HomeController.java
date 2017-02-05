package com.QAndA.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* Created by George on 10/02/2015.
*/
@Controller
public class HomeController {

	public HomeController(){
		System.out.println("HomeController found!");
	}

	@RequestMapping("/")
	public String index() {
		System.out.println("HomeController '/' hit");
		return "index";
	}

	@RequestMapping("/test")
	public String test(){
		System.out.println("HomeController '/test' hit");
		return "test";
	}


}
