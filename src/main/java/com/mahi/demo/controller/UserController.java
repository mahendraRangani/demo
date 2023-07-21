package com.mahi.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mahi.demo.entity.User;
import com.mahi.demo.serviceImpl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("welcome");
    	return model;
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	ModelAndView model = new ModelAndView();
    	model.addObject("users", userService.getUsers());
    	model.setViewName("dashboard");
    	return model;
    }

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public ModelAndView saveUser(User user) {
    	ModelAndView model = new ModelAndView();
    	model.addObject("users", userService.saveUser(user));
    	model.setViewName("sucess");
    	return model;
    }
		
}


