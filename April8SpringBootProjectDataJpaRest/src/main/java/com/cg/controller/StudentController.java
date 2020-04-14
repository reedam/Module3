package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;
import com.cg.service.StudentServiceI;

@RestController
public class StudentController {
	
  @Autowired
  StudentServiceI stuservice;
  
  @GetMapping(value="/student")
  public List<Student> fetchStudent()
  {
	  return stuservice.reterive();
  }
  
  @GetMapping(value="/student/{id}")
  public Student fetchone(@PathVariable int id)
  {
	  return stuservice.findbyId(id);
  }
  
  @PostMapping(value="/student/new" ,consumes = {"application/json"})
  public String addStudent(@RequestBody Student student)
  {
	  stuservice.create(student);
	  return "student added";
  }
  
  @DeleteMapping(value = "/student/delete/{id}")
   public String deletestudent(@PathVariable int id)
  {
	  stuservice.delete(id);
	  return "student deleted";
  }
}


//get--> get/student   reterive data student (ie all student)
//get-->get/student/1--->reterive one student
//post-->add data new student
//put-->update the student
//delete-->delete the studen