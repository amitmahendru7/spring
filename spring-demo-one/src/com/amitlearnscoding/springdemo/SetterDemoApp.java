package com.amitlearnscoding.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//Load the spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve Bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//Call methods on Bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//Close the context
		context.close();
	}

}
