package com.amitlearnscoding.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// Load the SPring Config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//Retrieve Bean from container
		Coach theCoach= context.getBean("myClass",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		//Close the context
		context.close();
		

	}

}
