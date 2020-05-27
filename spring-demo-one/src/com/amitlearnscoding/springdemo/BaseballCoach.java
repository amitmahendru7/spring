package com.amitlearnscoding.springdemo;

public class BaseballCoach implements Coach  {
	//Define a private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 min walking to DuckPond";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortunesrevice to get fortune
		return fortuneService.getFortune();
	}

}
