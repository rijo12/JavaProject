package assignment3;

public class ShopCount {

	public static void main(String[] args) {
		int maximumCapacity = 100;
		
		int restrictedCapacity = 50;
		
		int currentCapacity = 48;
		
		while (currentCapacity < maximumCapacity) {
			
			currentCapacity++;
			
			if (currentCapacity == 50) {
				
				break;
			}
		}
		System.out.println("Maximum Capacity reached");
	}

}
