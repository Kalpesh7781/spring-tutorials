package com.spring.orm.springorm;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.spring.orm.springorm.model.Student;

@Configuration
public class Javaconfig {
 
	 

@Bean("ds")
public DriverManagerDataSource getDataSource() {
	DriverManagerDataSource ds = new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false");
	ds.setUsername("root");
	ds.setPassword("Kalpesh");

	return ds;
}

@Bean("sessionFactory")
public LocalSessionFactoryBean getFactory()
{
	LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
	sessionFactory.setDataSource(getDataSource());
	sessionFactory.setHibernateProperties(getPro());
	sessionFactory.setAnnotatedClasses(com.spring.orm.springorm.model.Student.class);
	 return sessionFactory;
	
}

@Bean("prop")
public  Properties getPro()
{
	 Properties hb=new  Properties();
	 hb.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
	 hb.setProperty("hibernate.show_sql", "true");
	 hb.setProperty("hibernate.hbm2ddl.auto", "update");
	 return hb;
}
}
