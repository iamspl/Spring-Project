package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}

	/**
	 * @param fortuneService
	 */
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "just do it: " + fortuneService.getFortune();
	}
	
	
	// add an init method
	
	public void doMyStartupStuff() {
		
		System.out.println("TrackCoach: inside method doMyStarupStuff");
	}
	
	
	// add a destroy method
	
	public void doMyCleanupStuffYoYo() {
		
		System.out.println(" TrackCoach : inside method nside method");
		
	}
	
	

}
