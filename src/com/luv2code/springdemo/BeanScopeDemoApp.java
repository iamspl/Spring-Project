package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static  void main(String Args[]) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve the Bean from Container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
        System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
