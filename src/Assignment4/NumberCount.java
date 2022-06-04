package Assignment4;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number="";
		
		int count =0; // counter variable to get the number 
		
		System.out.println("Enter 'y' after entering numbers to get count");
		
		System.out.println("Enter the Number:");
		
		do {
			number =sc.next(); // input the number to variable number
			
			count++; // // variable count incremented by 1
			
			if (number=="y") { // checks the entered input is y
				
				break;    // exit the do while loop
			}
			
		}while(!number.equals("y"));  // checks the condition that user entered y
		
		System.out.println("Numbers Entered = "+count);
	}

}
