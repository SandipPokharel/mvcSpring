package mvcSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllers {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView display() {
		System.out.println("Hello there ! \n I am coming from hello");
		
	ModelAndView mv = new ModelAndView();
	
	mv.setViewName("helloo");
	mv.addObject("location", "Sandeep Pokharel");
		
	Customer c = new Customer();
	c.setName("Sandeep");
	c.setEmail("sandeeppokharel@gmail.com");
	
	mv.addObject("loggedInCustomer",c);
	return mv;
	

	}
}
