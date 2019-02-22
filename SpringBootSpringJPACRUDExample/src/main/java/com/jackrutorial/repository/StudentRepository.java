package com.jackrutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.jackrutorial.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
}