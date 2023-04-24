package com.spring.orm.springorm.dao;

import java.util.List;

import com.spring.orm.springorm.model.Student;

public interface Dao {
public int insert(Student student);
public void update(Student student);
public void delete(int StudentId);
public Student getStudent(int StudentId);
public List<Student> allStudents();
}
