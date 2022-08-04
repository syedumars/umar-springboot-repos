package com.umar.controller;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.umar.model.Alien;
import com.umar.repo.AlienRepo;

//@Controller
@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping(path="home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping(path="/addUser")
	public String addUser(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	//getUser
	@RequestMapping(path="/getUser")
	public ModelAndView getUser(Integer aid) {
		ModelAndView mav = new ModelAndView("displayUser.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		
		//filters any Tech contains "JAVA"
		//System.out.println(repo.findByTechIgnoreCase("JAvA")); 
		
		//filters any id greater than aId
		//System.out.println(repo.findByAidGreaterThan(alien.getaid()));
		
		System.out.println(repo.findByTechSortedByName(alien.getTech()));
		mav.addObject(alien);
		
//		System.out.println("passed ID: " + aid);
//		System.out.println("passed ID's object: " + alien);
//		System.out.println("mav Object = " + mav);
		
		return mav;
	}
	
	@RequestMapping(path="/users")
	@ResponseBody
	public List<Alien> getUsers() {
		return repo.findAll();
	}
	
	@RequestMapping(path="/user/{aid}",produces ={"application/json","application/xml"})
	@ResponseBody
	public Optional<Alien> getUser1(@PathVariable("aid") int  aid) {
		//System.out.println(aid);
		return repo.findById(aid);
	}
	
	@PostMapping(path="/user") //, consumes = {"multipart/form-data", "application/json","application/xml"})
	public String addUser1(@RequestBody  Alien alien) {
		repo.save(alien);
		String added = "Alien User " + alien.getaname() + " has been added.";
		return added;
	}
	
	@DeleteMapping(path="/user/{aid}")
	@ResponseBody
	public Optional<Alien> deleteUser(@PathVariable("aid") int  aid) {
		//System.out.println(aid);
		Optional<Alien> a = repo.findById(aid);
		repo.deleteById(aid);
		System.out.println(a+ " has been deleted");
		return a;
	}
	
	@PutMapping(path="/user")
	@ResponseBody
	public Alien updateUser(@RequestBody Alien a) {
		//System.out.println(aid);
		Alien b = new Alien(a);
		System.out.println(repo.findById(a.getaid())+ " will be replaced with \n  " + a.toString());
		//repo.deleteById(a.getaid());
		repo.save(b);
		//System.out.println(b.toString()+ " has been updated");
		return b;
	}
}
