package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	private CustomerDAO customerDAO;
	@RequestMapping("/list")
	public String listCustomer(Model theModel) {
		List<Customer> theCustomers=customerDAO.getCustomer();
		theModel.addAttribute("customer",theCustomers);
		return "list-customer";
	}

}
