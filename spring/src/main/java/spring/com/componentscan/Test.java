package spring.com.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
Car c1=context.getBean("c1",Car.class);
System.out.println(c1);
	}

}
