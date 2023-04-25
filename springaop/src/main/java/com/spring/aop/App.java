package com.spring.aop;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.service.Payment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/aop/config.xml");
       Payment payment=( Payment)context.getBean("payment", Payment.class);
       payment.makePayment();
    }
}
