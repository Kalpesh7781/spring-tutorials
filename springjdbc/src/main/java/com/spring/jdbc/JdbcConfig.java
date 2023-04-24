package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.Dao;
import com.spring.jdbc.dao.DaoImpl;

@Configuration
@ComponentScan(basePackages="com.spring.jdbc.dao")
public class JdbcConfig {
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false");
		ds.setUsername("root");
		ds.setPassword("Kalpesh");

		return ds;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate=new  JdbcTemplate();
		  jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
 
}