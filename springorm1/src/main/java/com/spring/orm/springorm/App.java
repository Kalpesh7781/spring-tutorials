package com.spring.orm.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springorm.dao.Dao;
import com.spring.orm.springorm.dao.DaoImpl;
import com.spring.orm.springorm.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/orm/springorm/config.xml");
       Dao dao=context.getBean("dao",DaoImpl.class);
       
       Student student=new Student();
       student.setId(10);
       student.setName("ram");
       student.setCity("pune");
       
       
       dao.insert(student);
    }
}
