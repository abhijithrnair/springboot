package com.abhijith.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/hello")
	String getHello() {
		return "hello";
	}
}
