package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@Service
public class StudentServiceImp implements StudentServiceI {

	@Autowired
	StudentDaoI studentdao;
	@Override
	
	public void create(Student s) {
		studentdao.create(s);
   }

	@Override
	public List reterive() {
		return studentdao.reterive();
	}

	@Override
	public Student findbyId(int id) {
		return studentdao.findById(id);
	}

	@Override
	public void delete(int id) {
		studentdao.delete(id);
	}

}




//rest                                       soap
//rest method-->get/post/put/delete