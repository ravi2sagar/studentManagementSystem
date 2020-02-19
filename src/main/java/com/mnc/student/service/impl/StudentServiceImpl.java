package com.mnc.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnc.student.dto.StudentDto;
import com.mnc.student.model.StudentDetails;
import com.mnc.student.repository.StudentRepository;
import com.mnc.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void createStudent(StudentDto studentDto) {

		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setStudentId(studentDto.getStudentId());
		studentDetails.setName(studentDto.getName());
		studentDetails.setBranch(studentDto.getBranch());
		studentRepository.save(studentDetails);
	}

	@Override
	public StudentDto updateStudent(Long studentId, StudentDto studentDto) {

		StudentDetails studentDetails = studentRepository.getOne(studentId);

		if (null != studentDetails) {

			studentDetails.setStudentId(studentDto.getStudentId());
			studentDetails.setName(studentDto.getName());
			studentDetails.setBranch(studentDto.getBranch());
			studentRepository.save(studentDetails);
			return studentDto;

		} else {
			studentDto.setError("Id not Present");
			return studentDto;
		}

	}

	@Override
	public StudentDto getStudentById(Long studentId) {

		StudentDetails studentDetails = studentRepository.getOne(studentId);
		StudentDto studentDto = new StudentDto();
		if (null != studentDetails) {

			studentDto.setStudentId(studentDetails.getStudentId());
			studentDto.setName(studentDetails.getName());
			studentDto.setBranch(studentDetails.getBranch());
		} else {
			studentDto.setError("Id not Present");
		}

		return studentDto;
	}
}
