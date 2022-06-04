package loopAssignment;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		int number,value;
		boolean prime= false ; // Initialized a boolean variable prime
							  // variable initialized to check the condition to exit the loop
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		
		number = sc.nextInt();  // input the number
		
		if (number==0 || number<0 || number ==1) {  // 0,1, negative values are not prime numbers
			
			System.out.println("Not a prime number");
		}
		
		if (number==2) {
			System.out.println("Prime Number");  // Separately check the condition for 2
			
		}
		if (number>2) {
			
			for (int i=2;i<=number/2;i++) { // checks for >2, prime numbers are natural numbers
											// loops continues until the number/2. (if number is 10, then checks for number/2=5)
				value= number%i;			// checks the remainder is zero
				
				if(value==0) {
					prime=true;			    // value=0, then prime is true.
					System.out.println("Not a Prime Number");
					break;
				}
										
			}
			if (!prime ) {            // prime is false 
				System.out.println("Prime Number");	
			}
			
		}	
	}

}
