package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleScopeDemoApp {

	public static void main(String[] args) {
		
		
	
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanLifeCycleScope-applicationContext.xml");
		Coach coach=applicationContext.getBean("myCoach", Coach.class);
		System.out.println(coach);
		applicationContext.close();
	}

}
