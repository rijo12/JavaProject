package loopAssignment;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		int number,value;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		
		number = sc.nextInt();
		
		if (number==0 || number<0 || number ==1) {
			
			System.out.println(" Not a prime number");
		}
		
		if (number==2) {
			System.out.println("Prime Number");
			
		}
		if (number>2) {
			
			for (int i=2;i<=number-1;i++) {
				
				value= number%i;
				
				if(value==0) {
					break;
				}
										
			}
			System.out.println("Not a Prime Number");
			
		}
			
		else {
			
			System.out.println("Prime Number");
		}
			
	}

}
