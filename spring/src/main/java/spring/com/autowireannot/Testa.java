package spring.com.autowireannot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.com.autowirexml.Employee;

public class Testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/com/autowireannot/awaconfig.xml");
		 A a=(A) context.getBean("a1");
		System.out.println(a);
	}

}
