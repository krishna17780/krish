package com.springmvc.springboot.mvcvalidations;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	
	//add a init to conver trim input strings
	//remove leading and trainging whitespace
	//resolve issue for our validations
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showFrom")
	public String showFrom(Model theModel) {
		theModel.addAttribute("Customer", new Customer());
		return "customer-form";

	}

	@RequestMapping("/customerProcess")
	public String customerProcess(@Valid @ModelAttribute("Customer") Customer theCustomer,
			BindingResult theBindingResult) {
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}

		return "customer-confirmation";

	}

}
