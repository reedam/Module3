package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Student;

@Service
public interface StudentServiceI {

	public void create(Student s);
	public List reterive();
	public Student findbyId(int id);
	public void delete(int id);

}
