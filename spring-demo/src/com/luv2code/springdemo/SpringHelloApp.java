package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		
	   //load the spring configuration file
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean
		RandomCoach theCoach=applicationContext.getBean("randomCoach", RandomCoach.class); 
		System.out.println(theCoach.getDailyWorkOut()+" "+theCoach.getDailyFortune());

		applicationContext.close();
	}

}
