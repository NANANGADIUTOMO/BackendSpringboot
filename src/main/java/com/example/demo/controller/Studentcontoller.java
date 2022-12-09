package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.Iservicestudent;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("api/Student")
public class Studentcontoller {
	@Autowired
	Iservicestudent iservicestudent;
	
	@PostMapping("/insert")
	public Student insertStudent(@RequestBody Student student) {
		return iservicestudent.insertStudent(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents(){
		return iservicestudent.getAllStudent();
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return iservicestudent.updateStudent(id, student);
	}
	
	@DeleteMapping("/delete/{id}")
	public Student deletStudent(@PathVariable int id) {
		return iservicestudent.deleteStudent(id);
	}
	
	@GetMapping("/getstudentbyId/{id}")
	public Student getStudentbyId(@PathVariable long id){
		return iservicestudent.getStudentbyId(id);
		
	}

}
