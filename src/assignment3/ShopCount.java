package assignment3;

import java.util.Scanner;

public class ShopCount {

	public static void main(String[] args) {
		int restrictedCount = 50;
		int currentCount = 20;// People inside the shop assumed to be zero.
		int peopleToEnter=0;
		
		System.out.println("Number of people to enter the shop");
		
		Scanner sc= new Scanner(System.in);
		peopleToEnter = sc.nextInt();
		
		
			if(peopleToEnter==0) {
				System.out.println("People in the shop"+ currentCount); // checks if the people wants to enter the shop is zero
			
			}
			
			if (currentCount< restrictedCount) { 
			
				while(peopleToEnter<50 ) {
					
					currentCount+=peopleToEnter;
					
					if(currentCount==50) {                                     // checks if the current count is 50
						
						System.out.println("People count inside the shop=50");
						System.out.println("Maximum Capacity Reached");
						break;
						
						}
					
					if (currentCount>=50) {
						
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
