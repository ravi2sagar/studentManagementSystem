package com.mnc.student.service;


import javax.validation.Valid;

import com.mnc.student.dto.StudentDto;

public interface StudentService {

	void createStudent(StudentDto studentDto);

	StudentDto updateStudent(Long studentId, @Valid StudentDto studentDto);

	StudentDto getStudentById(Long studentId);

}
