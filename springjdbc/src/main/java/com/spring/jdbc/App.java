package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.Dao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//for annotation
         ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
         Dao dao=context.getBean("dao", Dao.class);

    	//for xml
//    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        Dao dao=context.getBean("dao", Dao.class);
         //      INSERT
 		Student student = new Student();
 		student.setId(115);
 		student.setName("hari");
 		student.setCity("Indore");
 
 		int result = dao.insert(student);
 
 		System.out.println("student added " + result);
 		// UPDATE
// 		Student student=new Student();
// 		student.setId(1);
// 		student.setName("Raj Kumar");
// 		student.setCity("Lucknow");
// 		int result = dao.change(student);
// 		System.out.println("data changed "+result);

 		// DELETE
// 		int result = dao.delete(6668);
// 		System.out.println("deleted "+result);
// 		

// 		Student student =dao.getStudent(123);
// 		System.out.println(student);
 //
//
// 		List<Student> students = dao.getAllStudents();
// 		for (Student s : students) {
// 			System.out.println(s);
//    }
}
}