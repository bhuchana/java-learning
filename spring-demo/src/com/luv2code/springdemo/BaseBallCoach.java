package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {

	
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkOut()
	{
		return "Spend 30 minutes on batting practice";
	}
  
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public BaseBallCoach(FortuneService theFortuneService) {
		System.out.println();
		fortuneService = theFortuneService;
	}
	
	
	
}
