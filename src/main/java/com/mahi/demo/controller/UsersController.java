/*
 * package com.mahi.demo.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.mahi.demo.entity.Users; import
 * com.mahi.demo.serviceImpl.UsersServiceImpl;
 * 
 * @Controller public class UsersController {
 * 
 * @Autowired private UsersServiceImpl usersService;
 * 
 * @RequestMapping(value = "/login", method = RequestMethod.GET) public
 * ModelAndView welcome() { ModelAndView model = new ModelAndView();
 * model.setViewName("login"); return model; }
 * 
 * @RequestMapping(value = "/signup", method = RequestMethod.GET) public
 * ModelAndView saveSignup() { ModelAndView model = new ModelAndView();
 * model.setViewName("signup"); return model; }
 * 
 * @RequestMapping(value = "/signup", method = RequestMethod.POST) public
 * ModelAndView dashboard(Users users) { ModelAndView model = new
 * ModelAndView(); model.addObject("users", usersService.saveUser(users));
 * model.setViewName("signup"); return model; }
 * 
 * @RequestMapping(value = "/login", method = RequestMethod.POST) public
 * ModelAndView saveUser(Users users) { ModelAndView model = new ModelAndView();
 * model.addObject("users", usersService.saveUser(users));
 * model.setViewName("login"); return model; }
 * 
 * @RequestMapping(value = "/contact", method = RequestMethod.GET) public
 * ModelAndView contact(Users users) { ModelAndView model = new ModelAndView();
 * model.addObject("users", usersService.saveUser(users));
 * model.setViewName("contact"); return model; }
 * 
 * @RequestMapping(value = "/contact", method = RequestMethod.POST) public
 * ModelAndView saveContact(Users users) { ModelAndView model = new
 * ModelAndView(); model.addObject("users", usersService.saveUser(users));
 * model.setViewName("contact"); return model; }
 * 
 * @RequestMapping(value = "/about", method = RequestMethod.GET) public
 * ModelAndView about(Users users) { ModelAndView model = new ModelAndView();
 * model.addObject("users", usersService.saveUser(users));
 * model.setViewName("about"); return model; }
 * 
 * @RequestMapping(value = "/about", method = RequestMethod.POST) public
 * ModelAndView saveAbout(Users users) { ModelAndView model = new
 * ModelAndView(); model.addObject("users", usersService.saveUser(users));
 * model.setViewName("about"); return model; }
 * 
 * @RequestMapping(value = "/home", method = RequestMethod.GET) public
 * ModelAndView home(Users users) { ModelAndView model = new ModelAndView();
 * model.addObject("users", usersService.saveUser(users));
 * model.setViewName("home"); return model; }
 * 
 * @RequestMapping(value = "/home", method = RequestMethod.POST) public
 * ModelAndView saveHome(Users users) { ModelAndView model = new ModelAndView();
 * model.addObject("users", usersService.saveUser(users));
 * model.setViewName("home"); return model; } }
 */