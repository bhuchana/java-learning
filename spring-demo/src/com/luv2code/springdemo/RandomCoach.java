package com.luv2code.springdemo;

public class RandomCoach implements Coach {
   
	
	private RaFortuneService raFortuneService;
	

	public RandomCoach() {
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a har 5k";
	}

	@Override
	public String getDailyFortune() {
		return raFortuneService.getFortune();
	}

	public RaFortuneService getRaFortuneService() {
		return raFortuneService;
	}

	public void setRaFortuneService(RaFortuneService raFortuneService) {
		this.raFortuneService = raFortuneService;
	}

}
