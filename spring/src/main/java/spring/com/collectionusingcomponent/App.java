package spring.com.collectionusingcomponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/com/collectionusingcomponent/ con.xml");
		Student e1=(Student) context.getBean("student",Student.class);
		System.out.println(e1);
		
	}

}
