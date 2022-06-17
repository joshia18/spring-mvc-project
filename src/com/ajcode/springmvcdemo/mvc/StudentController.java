package com.ajcode.springmvcdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@RequestMapping("/student")
@Controller
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> CountryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a student object
		Student theStudent = new Student();
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);
		
		//adding countryObjects to the model
		theModel.addAttribute("countryOptions", CountryOptions);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + 
							theStudent.getLastName());
		
		return "student-confirmation";
	}
}