package com.cloudverge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }
	
}
