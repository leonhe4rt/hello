package com.capgemini.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello() {
		
		String hello = new String ("Hello");
		
		return hello;
	}

}
