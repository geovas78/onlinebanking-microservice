package com.onlinebankingms.vasilski.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "The the online banking app is under development";
	}
}
