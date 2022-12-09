package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface Iservicestudent {
	public Student insertStudent(Student Student);
	public List<Student> getAllStudent();
	public Student updateStudent (int id, Student Student);
	public Student deleteStudent(int id);
	public Student getStudentbyId(long id);


}
