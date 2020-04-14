package com.cg.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Stu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/")
public class HelloController {
	
	List<Stu> e=new ArrayList<>();
	
	public HelloController() {
		e.add(new Stu("A",1,"hr",15));
		e.add(new Stu("B",2,"softwareDeveloper",25));
				
	}
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String index(@PathVariable String name) {
		return "Welcome to Sring Boot!" + name;
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Stu> index() {

		return e ;
	}
	

	@RequestMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}

}