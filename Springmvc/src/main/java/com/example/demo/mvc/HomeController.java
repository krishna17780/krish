package com.example.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/Hello")
	public String showPage() {
		return "main-menu";
		
	}
}
