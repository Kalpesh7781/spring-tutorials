package com.spring.orm.springorm.dao;

 

 

 

import java.util.List;

 

import org.springframework.orm.hibernate5.HibernateTemplate;
 

import com.spring.orm.springorm.model.Student;

import jakarta.transaction.Transactional;

 

public class DaoImpl implements Dao {
HibernateTemplate hibernateTemplate;
 

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
@Transactional
public int insert(Student student) {
	// TODO Auto-generated method stub
	Integer i=(Integer) this.hibernateTemplate.save(student);
	return i;
}

public void update(Student student) {
	// TODO Auto-generated method stub
	this.hibernateTemplate.update(student);
 
}

public void delete(int StudentId) {
	// TODO Auto-generated method stub
	 Student student=this.hibernateTemplate.get(Student.class,StudentId);
	 this.hibernateTemplate.delete(student);
	
}

public Student getStudent(int StudentId) {
	// TODO Auto-generated method stub
	Student student=this.hibernateTemplate.get(Student.class,StudentId);
	return student;
	 
}

public List<Student> allStudents() {
	// TODO Auto-generated method stub
	List<Student> students =this.hibernateTemplate.loadAll(Student.class);
	return students;
}

}
