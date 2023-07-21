package com.mahi.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mahi.demo.entity.Home;
import com.mahi.demo.serviceImpl.HomeServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	private  HomeServiceImpl homeServiceImpl;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(Home home) {
		ModelAndView model = new ModelAndView();
		model.addObject("users", homeServiceImpl.getHome());
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView saveHome(Home home) {
		ModelAndView model = new ModelAndView();
		model.addObject("users", homeServiceImpl.saveHome(home));
		model.setViewName("home");
		return model;
	}
	
}
