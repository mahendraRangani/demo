package com.mahi.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mahi.demo.entity.Contact;
import com.mahi.demo.serviceImpl.ContactServiceImpl;

@Controller
public class ContactController {
	
	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contact(Contact contact) {
		ModelAndView model = new ModelAndView();
		model.addObject("users", contactServiceImpl.getContact());
		model.setViewName("contact");
		return model;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public ModelAndView saveContact(Contact contact) {
		ModelAndView model = new ModelAndView();
		model.addObject("users", contactServiceImpl.saveContact(contact));
		model.setViewName("contact");
		return model;
	}

	
	
}

