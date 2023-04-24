package spring.com.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring/com/autowirexml/awconfig.xml");
	Employee a=(Employee) context.getBean("emp");
	System.out.println(a);
}
}
