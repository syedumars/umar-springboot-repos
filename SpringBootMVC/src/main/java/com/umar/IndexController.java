package com.umar;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	/* 1. --The below is old Servlet method
	 * 
	 * @RequestMapping("index") 
	 * //@ResponseBody 
	 * public String index(HttpServletRequest request) 
	 * { HttpSession session = request.getSession(); 
	 * System.out.println(session); 
	 * String s = request.getParameter("name");
	 * session.setAttribute("username", s); 
	 * return "index"; 					//Separation of Concerns
	 * }
	 */
	
	///2. Instead of above, let's try Spring MVC  approach by taking session data ;)
	//The problem with this approach is when the Request parameters are lot more in numbers!
	/*
	 * @RequestMapping("index") 	//CONTROLLER or SERVLET 
	 * public String index(@RequestParam("uname") String name, HttpSession session) {
	 * session.setAttribute("username", name); //MODEL or DATA 
	 * return "index"; //Separation of Concerns //VIEW or UI 
	 * }
	 */
	
	
	//3.
	//Let's try "ModelAndView" response approach which is an inbuilt response class
	/* Here, we still have to map individual parameters!!!
	 * 
	 * @RequestMapping("index") //CONTROLLER or SERVLET //@ResponseBody public
	 * ModelAndView index(@RequestParam("uname") String name, HttpSession session) {
	 * ModelAndView mav = new ModelAndView();
	 * mav.addObject("username", name); mav.setViewName("index");
	 * session.setAttribute("username", name); return mav; //MODEL&VIEW }
	 */
	
	
	 //4. Instead of all above approaches, lets create a POJO class and save in all user data
	
	@RequestMapping("index")						//CONTROLLER or SERVLET
	//@ResponseBody
	public ModelAndView index(UserDetails ud)
	{	
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("details", ud); ///MODEL or DATA
		mav.setViewName("index");  		// VIEW 
		
		return mav;	//MODEL&VIEW
	}
}
