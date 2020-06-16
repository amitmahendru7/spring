package com.amitlearnscoding.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//create no-arg constructor
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:  setter- setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
