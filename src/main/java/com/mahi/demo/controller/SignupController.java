package com.mahi.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mahi.demo.entity.Signup;
import com.mahi.demo.serviceImpl.SignupServiceImpl;
@Controller
public class SignupController {

	@Autowired
	private SignupServiceImpl signupServiceImpl;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView saveSignup() {
		ModelAndView model = new ModelAndView();
		model.addObject("users", signupServiceImpl.getSignup());
		model.setViewName("register");
		return model;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView dashboard(Signup signup) {
		ModelAndView model = new ModelAndView();
		model.addObject("users", signupServiceImpl.saveSignup(signup));
		model.setViewName("signup");
		return model;
	}
	
	
}
