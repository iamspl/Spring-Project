package com.luv2code.springdemo;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	
	
	//Create an Array of Strings
	
	private String [] data = {
			
			"Beware of the howards mother",
			"Sheldon is too noisy",
			"Big Bang theory is awesome"
	};
	
	//create a random number generator
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune =data[index];
		
		return theFortune;
	}

}
