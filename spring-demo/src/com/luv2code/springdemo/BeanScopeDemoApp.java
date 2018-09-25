package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
	
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach coach=applicationContext.getBean("myCoach", Coach.class);
		Coach coach1=applicationContext.getBean("myCoach", Coach.class);
		System.out.println(coach==coach1);

	}

}
