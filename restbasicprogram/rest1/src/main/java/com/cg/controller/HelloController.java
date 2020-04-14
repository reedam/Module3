package com.cg.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Emp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/")
public class HelloController {
	
	List<Emp> e=new ArrayList<>();
	
	public HelloController() {
		e.add(new Emp("A",1));
		e.add(new Emp("B",2));
				
	}
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String index(@PathVariable String name) {
		return "Welcome to Sring Boot!" + name;
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Emp> index() {

		return e ;
	}
	

	@RequestMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}

}