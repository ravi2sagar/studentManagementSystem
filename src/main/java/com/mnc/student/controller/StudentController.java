package com.mnc.student.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mnc.student.dto.StudentDto;
import com.mnc.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	StudentService studentService;

	@PostMapping("/student")
	public void createStudent(@Valid @RequestBody StudentDto studentDto) {
		studentService.createStudent(studentDto);
	}

	@PutMapping("/student/{studentId}")
	public StudentDto updateStudent(@PathVariable(value = "studentId") Long studentId,
			@Valid @RequestBody StudentDto studentDto) {
		return studentService.updateStudent(studentId, studentDto);
	}

	@GetMapping("/student/{studentId}")
	public StudentDto getStudentById(@PathVariable(value = "studentId") Long studentId) {
		return studentService.getStudentById(studentId);

	}

}
