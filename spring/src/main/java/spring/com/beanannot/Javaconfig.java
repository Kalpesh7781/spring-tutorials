package spring.com.beanannot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
 
public class Javaconfig {

	@Bean
	public Car getCar()
	{
		Car c1=new Car();
		return c1;
	}
}
