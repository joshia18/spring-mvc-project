package com.ajcode.springmvcdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//the first request mapping is to show the initial HTML form
	@RequestMapping("/")
	public String showPage() {
		//spring will generate the view name automatically as /WEB-INF/view/main-menu.jsp
		//with the prefix and suffix in xml file
		return "main-menu";
	}
}
