package com.mnc.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication {

	private static final Logger log = LoggerFactory.getLogger(StudentManagementApplication.class);

	public static void main(String[] args) {
		log.debug("Exiting Application");
		SpringApplication.run(StudentManagementApplication.class, args);
		log.debug("Exiting Application");
	}

}