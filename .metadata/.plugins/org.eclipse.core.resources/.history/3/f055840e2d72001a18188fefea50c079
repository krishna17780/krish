package com.springmvc.springboot.controllerex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloworldController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";

	}

	// needa controller mathod to process the html form
	@RequestMapping("/processMethod")
	public String processForm() {
		return "helloworld";

	}

	// new a controller method to read form data and data to the model

	@RequestMapping("/processMethodV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// read the request from the html form
		String theName = request.getParameter("studentName");

		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "yo! " + theName;
		// add messade to the model
		model.addAttribute("message", result);

		return "helloworld";

	}

	@RequestMapping("/processMethodVThree")
	public String processMethodVThree(@RequestParam("studentName") String theName, Model model) {

		// read the request from the html form

		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Hey buddy ! " + theName;
		// add messade to the model
		model.addAttribute("message", result);

		return "helloworld";

	}

}
