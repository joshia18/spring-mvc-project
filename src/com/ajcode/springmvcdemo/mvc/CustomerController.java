package com.ajcode.springmvcdemo.mvc;

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
	
	//what the below @InitBinder does ?
	//pre-process every string data from the requests
	//Removes leading and trailing spaces
	//If string has only white space, it trims down to null
	//this method will be called for every web requests coming to our controller
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		//the below class StringTrimmerEditor is defined in Spring API
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		//register this editor as custom binder
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) { 
		
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		//or theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	//Here @Valid means perform validation rules on the customer object
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
		System.out.println("lastName: |" + theCustomer.getLastName() + "|");
		
		//This binding result has a lot of information and gives idea about the codes
		//and we can replace that with our own message
		//we can inspect the console logs
		System.out.println("Binding Result: " + theBindingResult);
		
		System.out.println("\n\n\n\n");
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else{
			return "customer-confirmation";
		}
		
	}
}
