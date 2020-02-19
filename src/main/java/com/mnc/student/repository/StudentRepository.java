package com.mnc.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnc.student.model.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Long>{

}
