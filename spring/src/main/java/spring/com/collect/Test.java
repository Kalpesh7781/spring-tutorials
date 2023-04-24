package spring.com.collect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring/com/collect/collectioncon.xml");
		Employee e1=(Employee) context.getBean("emp1");
		System.out.println(e1.name);
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddress());
		System.out.println(e1.getCourse());
		System.out.println();
		
		Employee e2=(Employee) context.getBean("emp2");
		System.out.println(e2.name);
		System.out.println(e2.getPhones());
		System.out.println(e2.getAddress());
		System.out.println(e2.getCourse());
		
	}

}
