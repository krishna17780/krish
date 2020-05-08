package com.springmvc.springboot.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showFrom")
	public String showFrom(Model theModel) {

		StudentEx theStudent = new StudentEx();
		theModel.addAttribute("StudentEx", theStudent);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("StudentEx") StudentEx theStudentEx) {
		
		System.out.println(theStudentEx.getFirstName());
		System.out.println(theStudentEx.getLastName());
		System.out.println(theStudentEx.getCounttry());
		return "student-confirmation";
	}
}
