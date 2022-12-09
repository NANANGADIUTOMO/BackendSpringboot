package com.example.demo.service.implservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;
import com.example.demo.repository.Irepostudent;
import com.example.demo.service.Iservicestudent;

@Service
public class Servicestudent implements Iservicestudent {
	
	@Autowired
	Irepostudent Irepostudent;
	
	@Override
	public Student insertStudent(Student Student) {
		// TODO Auto-generated method stub
		return Irepostudent.insertStudent(Student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return Irepostudent.getAllStudent();
	}

	@Override
	public Student updateStudent(int id, Student Student) {
		// TODO Auto-generated method stub
		return Irepostudent.updateStudent(id, Student);
	}

	@Override
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		return Irepostudent.deleteStudent(id);
	}

	@Override
	public Student getStudentbyId(long id) {
		// TODO Auto-generated method stub
		return Irepostudent.getStudentbyId(id);
	}

}
