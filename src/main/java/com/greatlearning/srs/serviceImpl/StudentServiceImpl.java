package com.greatlearning.srs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.srs.entity.Student;
import com.greatlearning.srs.repository.StudentRepository;
import com.greatlearning.srs.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> listAll() {
		return repository.findAll();
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
