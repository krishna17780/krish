package com.springmvc.springboot.controllerex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sillyController {
	
	@RequestMapping("/showForm")
 public String displayTheForm() {
	return "helloworld";
	 
 }
	
}
