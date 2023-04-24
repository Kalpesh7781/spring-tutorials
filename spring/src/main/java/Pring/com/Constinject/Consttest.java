package Pring.com.Constinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class Consttest {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("Pring/com/Constinject/constconfig.xml");
	Person p=(Person) context.getBean("p1");
	System.out.println(p);
}
}
