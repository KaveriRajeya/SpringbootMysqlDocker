package com.example.SpringBootMysqlDocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootMysqlDocker.entity.Student;
import com.example.SpringBootMysqlDocker.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;
	
	@GetMapping("/findAll")
	public List<Student>getAllStudent()
	{
		return studentRepo.findAll();
	}
	
	@PatchMapping("/insert")
	public Student insert(@RequestBody Student student) 
	{
		return studentRepo.save(student);
	}
}
