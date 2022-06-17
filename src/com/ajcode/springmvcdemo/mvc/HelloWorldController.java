package com.ajcode.springmvcdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the form
	//this request will handle the processForm action in helloworld-form.jsp
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-process";
	}
	
	//new controller method to read form data
	//and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		//read the request parameter from the HTML form
		String theString = request.getParameter("studentName");
		
		//convert the string to all caps
		theString = theString.toUpperCase();
		
		//create the message
		String result = "Yo Yo! "+ theString;
		
		//add message to the model
		//here "message" is the key used the access the result string in jsp page
		model.addAttribute("message", result);
		
		return "helloworld-process";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, Model model) {
				
		//convert the string to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hey My Friend from v3! "+ theName;
		
		//add message to the model
		//here "message" is the key used the access the result string in jsp page
		model.addAttribute("message", result);
		
		return "helloworld-process";
	}
}
