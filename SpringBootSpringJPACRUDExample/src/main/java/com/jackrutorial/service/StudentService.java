package com.jackrutorial.service;

import java.util.List;

import com.jackrutorial.model.Student;

public interface StudentService {
	
	public void deleteStudent(long id);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(long id);
	
	public void saveOrUpdate(Student article);
}