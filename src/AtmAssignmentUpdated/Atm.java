package AtmAssignmentUpdated;

import java.util.Scanner;

public class Atm {

	Scanner sc = new Scanner(System.in);

	int personindex = 0;

	boolean AtmidentityCheck(PersonDetails[] person) { 

		boolean pincheck = false;

		System.out.println("Enter the Account Number");

		int account = sc.nextInt();

		for (int i = 0; i < person.length; i++) { // checking the details stored in the array with the entered account number

			if (account == person[i].accountNumber) {

				personindex = i; // array index stored

				System.out.println("Hi " + person[personindex].accountHolderName);

				break;

			} else {

				System.out.println("invalid Card");

				break;

			}
		}

		pincheck = person[personindex].Pincheck(person[personindex]);

		return pincheck;

	}

	void atmWithdrawDeposit(PersonDetails[] person) {

		System.out.println("Select 1.Deposit/2.Withdraw");

		String atmFunctions = sc.next();

		switch (atmFunctions) {

		case "1": {

			System.out.println("Enter the amount to desposit");

			int deposit = sc.nextInt();

			person[personindex].DepositBalance(deposit, person[personindex]);  // Calling the method DepositBalance with passing inputs deposit value and selected person details

			break;
		}

		case "2": {

			System.out.println("Enter the amount to withdraw: ");

			int withdraw = sc.nextInt();

			person[personindex].withdrawBalance(withdraw, person[personindex]); // Calling the method DepositBalance with passing inputs Withdraw value and selected person details

			break;
		}
		default:

			System.out.println("Invalid Entry");
		}

	}

}
