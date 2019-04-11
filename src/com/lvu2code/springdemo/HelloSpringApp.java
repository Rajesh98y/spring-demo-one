package com.lvu2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the Spring configuration file
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach coach=context.getBean("myCoach",Coach.class);
		
		//call method
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
