package com.ps.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.student.model.Student;
import com.ps.student.service.Student_service;

@RestController
public class Student_controller {
	
	//autowire 
	@Autowired
	Student_service service;
	
	//inserting Data in DB 
	@PostMapping("/Student")
	private int saveStudent(@RequestBody Student student) 
	{
		service.saveOrUpdate(student);
	return student.getId();
	}


	//Updating Data in DB 
	@PutMapping("/update")
	private Student update(@RequestBody Student student) 
	{
	service.saveOrUpdate(student);
	return student;
	}

	//Fetch all data from DB
	@GetMapping("/fetch")
	private List<Student> getAllStudents()
	{
	return service.getAllStudent();
	}
	
	//Fetch  data from DB by ID
	@GetMapping("/fetch/{id}")
	private Student getStudent(@PathVariable("id") int id) 
	{
	return service.getStudentById(id);
	}
	
	//Delete Records from Db
	@DeleteMapping("/fetch/{id}")
	private void DeleteStudent(@PathVariable("id") int id) 
	{
		service.delete(id);
	}
	
}
