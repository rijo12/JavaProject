package rocketAssignment;

public class Rocket implements SpaceShip {
	
	int weight;
	
	int maxWeight;
	
	int canCarryWeight=0;
	

	@Override
	public boolean launch() {
		
		return true;
	}

	@Override
	public boolean land() {
		
		return true;
	}

	@Override
	public boolean canCarry(Item array) {
		
		if (canCarryWeight<weight) {
			
			return true;
		}
		else
	
		return false;
	}

	@Override
	public double carry(Item array) {
		
		weight+=array.getWeight();
		
		return weight;
	}

}
