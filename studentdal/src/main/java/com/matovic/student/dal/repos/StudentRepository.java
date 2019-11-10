package com.matovic.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.matovic.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
