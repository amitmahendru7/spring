package com.amitlearnscoding.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationCOntext.xml");

		//retrieve the bean
		Coach theCoach = context.getBean("myClass",Coach.class);
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();

	}

}
