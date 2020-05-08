package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paymentprovider")
public class paymentController {
	
	@GetMapping("/payNow/{price}")
	public String payNow(@PathVariable int price) {
		return "payment this" + price + "is successful";
	}

}
