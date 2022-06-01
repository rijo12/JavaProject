package Assignment4;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number="";
		
		System.out.println("Enter 'y' after entering numbers to get count");
		
		System.out.println("Enter the Number:");
		
		for (int i=1;i<=100;i++) {
			
			number= sc.next();
			
			if(number.equals("y")) {
				
				System.out.println("Numbers Entered= "+i);
				
				break;
			}
			
		}
		

	}

}
