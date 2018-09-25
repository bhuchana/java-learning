package com.luv2code.springdemo;

public class CricketCoach implements Coach {
  
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	
	public CricketCoach() {
		System.out.println("inside no-arg constructor");
	}

	@Override
	public String getDailyWorkOut()
	{
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside set");
		this.fortuneService = fortuneService;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	
	
}
