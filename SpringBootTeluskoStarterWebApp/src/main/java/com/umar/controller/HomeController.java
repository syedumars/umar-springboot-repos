package com.umar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.umar.model.Alien;
;

@Controller
public class HomeController {
	
	@RequestMapping(path = "home")
	//@ResponseBody  //will return the String as it is to Browser!
	public ModelAndView home(Alien alien) 
	{	
		ModelAndView mv = new ModelAndView();
		
		mv.addObject(alien);
		mv.setViewName("home");
		return mv;
	}

}
