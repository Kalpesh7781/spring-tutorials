package spring.com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.com.ref.A;

public class Testlc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring/com/lifecycle/lifeconfig.xml");
Samosa s=(Samosa) context.getBean("s1");
System.out.println(s);
context.registerShutdownHook();
	}

}
