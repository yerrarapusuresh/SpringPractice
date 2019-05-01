package com.suresh.springbootpractice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.springbootpractice.types.Student;

@RestController
public class StudentRestController {

	@RequestMapping("getStudentList")
	public List<Student> getStudentList() {
		return Arrays.asList(new Student("Suresh", 23, 45), new Student("Sunil", 25, 46));
	}

}
