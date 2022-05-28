package assignment3;

import java.util.Scanner;

public class ShopCount {

	public static void main(String[] args) {
		int restrictedCount = 50;
		int currentCount = 3;// People inside the shop assumed to be zero.
		int peopleToEnter=0;
		
		System.out.println("Number of people to enter the shop");
		
		Scanner sc= new Scanner(System.in);
		peopleToEnter = sc.nextInt();
		
			if (peopleToEnter==0) {
				System.out.println("People count inside the shop="+currentCount);// execute this line if entered value is zero
			}
			if (peopleToEnter>=50) {
				System.out.println("Enter a value less than 50");// execute this line if entered value is >=50
			}
			
			if (currentCount< restrictedCount && peopleToEnter<50) {  //checks if the current count less than 50 and entered value also less than 50
			
				while(!(peopleToEnter==0) ) {// checks if the entered value not equal to zero
					
						currentCount+=peopleToEnter;
					
					
					
					if(currentCount==50) {                                     // checks if the current count is 50
							
						System.out.println("People count inside the shop=50");
						System.out.println("Maximum Capacity Reached");
						break;
						
						}
					
					if (currentCount>=50) {									// checks if the current count >=50
						System.out.println("people can enter=" + (restrictedCount- currentCount+peopleToEnter));
						System.out.println("people wait outside="+(currentCount-restrictedCount));
						System.out.println("People count inside the shop=50");
						System.out.println("Maximum Capacity Reached");
						break;
						
						}
					System.out.println("People count inside the shop="+currentCount);	
					System.out.println("people can enter=" + (restrictedCount- currentCount));
		}
				
		}	
			
	}

}
