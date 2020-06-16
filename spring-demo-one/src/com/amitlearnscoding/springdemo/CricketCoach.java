package com.amitlearnscoding.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Create fields for email and Team name
	
	private String emailAddress;
	private String team;
	
	
	//create no-arg constructor
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	
	//Our Getter and setter methods
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method - setTeam");
		this.team = team;
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
