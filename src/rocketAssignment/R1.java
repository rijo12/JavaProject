package rocketAssignment;

import java.util.Random;

public class R1 extends Rocket {



	@Override
	public boolean launch() {
		
		Random random = new Random();
		
		double rand= random.nextDouble();
		
		int factor = (int)(0.05*(weight)/maxWeight);
	
		return factor >=rand;
	}
	
	
	@Override
	public boolean land() {
		
		Random random = new Random();
		
		double rand= random.nextDouble();
		
		int factor = (int)(0.01*(weight)/maxWeight);
	
		return factor >=rand;
	}
	
	

}
