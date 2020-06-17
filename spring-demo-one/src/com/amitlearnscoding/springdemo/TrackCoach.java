package com.amitlearnscoding.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a Hard 5K miles today!!!";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it "+fortuneService.getFortune();
	}

	//add init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside mthod  doMyStartupStuff");
	}
	
	//add destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: Inside mthod  doMyCleanupStuffYoYo");
	}
}
