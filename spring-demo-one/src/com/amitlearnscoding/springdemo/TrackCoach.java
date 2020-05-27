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

}
