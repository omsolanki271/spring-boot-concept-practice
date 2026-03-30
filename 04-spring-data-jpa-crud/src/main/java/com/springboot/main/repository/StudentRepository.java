package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	 
}
