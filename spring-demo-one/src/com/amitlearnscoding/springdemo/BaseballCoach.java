package com.amitlearnscoding.springdemo;

public class BaseballCoach implements Coach  {
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 min walking to DuckPond";
	}

}
