package com.amitlearnscoding.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load the SPring Config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve Bean from container
		Coach theCoach= context.getBean("myClass",Coach.class);
		
		Coach alphaCoach= context.getBean("myClass",Coach.class);
		
		//check if they are same
		
		boolean result= (theCoach==alphaCoach);
		System.out.println("\n Poiting to the same object: "+result);
		
		System.out.println("\n Memory Location of theCoach: "+theCoach);
		
		System.out.println("\n Memory Location of theCoach: "+alphaCoach);
		
		//Close the context
		context.close();

	}

}
