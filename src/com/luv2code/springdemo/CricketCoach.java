package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for email address and team
	private String emailAddress;
	private String team;
	

	//create a no-arg constructor   
    public CricketCoach() {
    	System.out.println("Cricketcoach:  inside no-arg constructor");
    }
    
    
	
	public String getEmailAddress() {
		System.out.println("Cricketcoach: inside setter method -setFortuneService");
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricketcoach: inside setter method -setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		
		System.out.println("Cricketcoach: inside setter method -setTeam");
		this.team = team;
	}



	public FortuneService getFortuneService() {
		return fortuneService;
	}



	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("Cricketcoach: inside setter method -setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
	
		return "Practice Fast Bowling for 25 minutes";
	}

	@Override
	public String getDailyFortune() {
	
		return "Im having a great day";
	}

}
