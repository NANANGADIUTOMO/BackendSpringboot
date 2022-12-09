package com.example.demo.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
import com.example.demo.repository.Irepostudent;
import com.example.demo.repository.Irepostudent;

@Repository
public class Repostudent implements Irepostudent {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Student insertStudent(Student student) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_student("
				+ "deskripsi_diri, "
				+ "email, "
				+ "hard_skill, "
				+ "interest, "
				+ "jenis_kelamin, "
				+ "nama, "
				+ "soft_skill, "
				+ "umur)" 
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(query, new Object[] {student.getDeskripsi_diri(), 
				student.getEmail(),
				student.getHard_skill(), 
				student.getInterest(), 
				student.getJenis_kelamin(),
				student.getNama(), 
				student.getSoft_skill(), 
				student.getUmur()});
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_student ";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Student.class));
	}

	@Override
	public Student updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		String query ="UPDATE tb_student SET "
				+ "deskripsi_diri = ? , "
				+ "email = ?, "
				+ "hard_skill = ?, "
				+ "interest = ?, "
				+ "jenis_kelamin = ?,"
				+ "nama = ?, "
				+ "soft_skill = ?, "
				+ "umur = ? 	"
				+ "WHERE id = ?";
		
		jdbcTemplate.update(query, new Object[] {
				student.getDeskripsi_diri(), 
				student.getEmail(), 
				student.getHard_skill(),
				student.getInterest(), 
				student.getJenis_kelamin(), 
				student.getNama(), 
				student.getSoft_skill(), 
				student.getUmur(), id});
		
		return student;
	}

	@Override
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_student WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Student.class), id);
		
		query = "DELETE FROM tb_student WHERE id = ?";
		jdbcTemplate.update(query, id);
		
		return result;
	}

	@Override
	public Student getStudentbyId(long id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_student WHERE id = ?";
		return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Student.class), id);
	}

}
