package com.example.ass1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
	
	@RequestMapping("/")
	public String Name() {
		return "People Bank";
	}
	
	@RequestMapping("/address")
	public String address() {
		return "Plot no.04, Vasant Vihar, New Delhi, 100061";
	}


}
