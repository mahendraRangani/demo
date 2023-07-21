package com.mahi.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mahi.demo.entity.About;
import com.mahi.demo.serviceImpl.AboutServiceImpl;

@Controller
public class AboutController {

	@Autowired
	private AboutServiceImpl aboutServiceImpl;

	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about(About about) {
		ModelAndView model = new ModelAndView();
		model.addObject("users", aboutServiceImpl.getAbout());
		model.setViewName("about");
		return model;
	}

	@RequestMapping(value = "/about", method = RequestMethod.POST)
	public ModelAndView saveAbout(About about) {
		ModelAndView model = new ModelAndView();
		model.addObject("users", aboutServiceImpl.saveAbout(about));
		model.setViewName("about");
		return model;
	}

	@RequestMapping(value = "/about", method = RequestMethod.DELETE)
	public ModelAndView deleteAbout(long id) {
		ModelAndView model = new ModelAndView();
		model.addObject("users");
		model.setViewName("about");
		return model;
	}
	@RequestMapping(value = "/about", method = RequestMethod.OPTIONS)
	public ModelAndView getById(long id) {
		ModelAndView model = new ModelAndView();
		model.addObject("users", aboutServiceImpl.findById(id));
		model.setViewName("about");
		return model;
	}
	@RequestMapping(value = "/about", method = RequestMethod.PUT)
	public ModelAndView update(About about,long id) {
		ModelAndView model = new ModelAndView();
		model.addObject("users");
		model.setViewName("about");
		return model;
	}

	
}
