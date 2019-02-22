package com.jackrutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jackrutorial.model.Student;
import com.jackrutorial.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository articleRepository;
	
	@Override
	public void deleteStudent(long id) {
		articleRepository.deleteById(id);
	}
	
	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) articleRepository.findAll();
	}
	
	@Override
	public Student getStudentById(long id) {
		return articleRepository.findById(id).get();
	}
	
	@Override
	public void saveOrUpdate(Student article) {
		articleRepository.save(article);
	}
	
}