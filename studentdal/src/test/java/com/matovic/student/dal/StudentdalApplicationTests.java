package com.matovic.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.matovic.student.dal.entities.Student;
import com.matovic.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	public StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		System.out.println("This is our test for Creating Student");
		
		Student stud = new Student();
		stud.setName("Novak Djokovic");
		stud.setCourse("Java WEB services");
		stud.setFee(35d);
		
		studentRepository.save(stud);
	}

}
