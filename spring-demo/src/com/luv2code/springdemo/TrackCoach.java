package com.luv2code.springdemo;

public class TrackCoach implements Coach {
   
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a har 5k";
	}

	@Override
	public String getDailyFortune() {
		return "just do"+fortuneService.getFortune();
	}
	
    //add init methods
	
	public void doMyStartUpStuff()
	{
		System.out.println("inside doMyStartUpStuff");
	}
	//add destroy method
	
	public void doMyCeanUpStuff()
	{
		System.out.println("inside doMyCeanUpStuff");
	}

}
