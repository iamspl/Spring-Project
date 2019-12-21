package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	
	public static  void main(String Args[]) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve the Bean from Container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//check if they are the same Beans
		
		boolean result = (theCoach == alphaCoach);
		
		//Print the Result
		
		System.out.println("\n pointing to the same object: " + result);
		
		System.out.println("\n memory location  to theCoach: " + theCoach);
		
		System.out.println("\n pointing to the alphaCoach :" + alphaCoach + "\n");
		
		//close the context
		context.close();
	}

}
