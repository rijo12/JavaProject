package Loop;

import java.util.Scanner;
// You take a loan from a friend and need to calculate how much you will owe him after 3 months.
//You are going to pay him back 10% of the remaining loan amount each month. 
//Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.

public class ForLoopExample {

	public static void main(String[] args) {
		double loanAmount = 0;
		double monthlyAmount = 0;
		double monthlyInstalment = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		loanAmount = sc.nextInt();

		for (int i = 1; i <= 3; i++) {
			monthlyInstalment = loanAmount * 0.1;
			System.out.println(i + "month 10% loan amount= " + monthlyInstalment);
			monthlyAmount = loanAmount - (monthlyInstalment);
			System.out.println("After" + i + " month Remaining Amount=" + monthlyAmount);
			loanAmount = monthlyAmount;

		}
		System.out.println("Remaining Amount after 3 months= " + loanAmount);
	}

}
