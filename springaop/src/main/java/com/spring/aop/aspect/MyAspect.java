package com.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.spring.aop.service.Payment.makePayment())")
	public void hi()
	{
		System.out.println("this is execute before");
	}
//	@After("execution(* com.spring.aop.service.Payment.makePayment())")
//	public void after()
//	{
//		System.out.println("this is execute after");
//	}
	
}
