package com.savekompany.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class BaseController {
	String message = "Welcome to Power Distribution Module!";
 
	@RequestMapping("/init")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Pay") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("landingPage");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}