package spring.com.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.com.collect.Employee;

public class Reftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/com/ref/refconfig.xml");
		A a=(A) context.getBean("a1");
		System.out.println(a);
	
	}

}
