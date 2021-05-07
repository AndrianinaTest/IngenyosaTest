package com.First.api.Controller;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class UserController {
	@RequestMapping(value="/menu" , method = RequestMethod.GET)
	public String welcomePage(Model model) {
		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome");
		
		return  "menu";
	}
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	public String LoginPage(Model model) {
		return "loginPage";
	}
	


}
