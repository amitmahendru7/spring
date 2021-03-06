package com.amitlearnscoding.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve the bean
		Coach theCoach = context.getBean("myClass",Coach.class);
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();

	}

}
