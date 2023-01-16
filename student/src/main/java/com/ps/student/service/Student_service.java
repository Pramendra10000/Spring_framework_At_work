package com.ps.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ps.student.model.Student;
import com.ps.student.repository.Student_repository;


@Service
public class Student_service {

	@Autowired
	Student_repository repository;
	
	//save
	public void saveOrUpdate(Student student) 
	{
	repository.save(student);
	}
	
	//Update 
	public void update(Student student, int id) 
	{
	repository.save(student);
	}
	
	//Delete
	public void delete(int id) 
	{
	repository.deleteById(id);
	}
	
	//Fetch By ID
	public Student getStudentById(int id) 
	{
	return repository.findById(id).get();
	}
	
	
	//Fetch ALl
	public List<Student> getAllStudent() 
	{
	List<Student> Student = new ArrayList<Student>();
	repository.findAll().forEach(Student1 -> Student.add(Student1));
	return Student;
	}
	
	
	
}
