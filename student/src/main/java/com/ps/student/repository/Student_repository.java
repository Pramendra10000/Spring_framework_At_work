package com.ps.student.repository;

import org.springframework.data.repository.CrudRepository;
import com.ps.student.model.Student;

public interface Student_repository extends CrudRepository<Student , Integer>
{
	
}
