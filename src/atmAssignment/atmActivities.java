package atmAssignment;

import java.util.Scanner;

public class atmActivities {

	Scanner sc = new Scanner(System.in);

	void userdetails(Person[] persondetails, Atm atmfunctions) {

		int pinNumber = 0;

		boolean pinCorrectCheck = false;

		boolean accountCorrect = false;

		System.out.println("Enter the Account Number:");

		long account = sc.nextLong();

		for (int i = 0; i < persondetails.length; i++) {

			if (account == persondetails[i].accountNumber) {

				accountCorrect = true;

				System.out.println("Welcome " + persondetails[i].accountHolderName);

				for (int j = 2; j >= 0; j--) {

					System.out.println("Enter Pin Number: ");

					pinNumber = sc.nextInt();

					pinCorrectCheck = persondetails[i].pinCorrect(pinNumber, persondetails[i]);

					if (pinCorrectCheck) {

						atmoperations(persondetails[i], atmfunctions);

						break;
					}

					if (!pinCorrectCheck) {

						System.out.println("You Have " + j + " more attempts");

						if (j == 0) {

							System.out.println("Card Blocked");

						}
					}

				}

			}

		}
		if (!accountCorrect) {

			System.out.println("Invalid Card");
		}

	}

	void atmoperations(Person person, Atm atmfunctions) {

		System.out.println("Select Deposit/Withdraw");

		String atmop = sc.next();

		switch (atmop) {

		case "Deposit": {

			System.out.println("Enter the amount to desposit");

			int deposit = sc.nextInt();

			atmfunctions.atmDeposit(deposit, person);

			break;
		}

		case "Withdraw": {

			System.out.println("Enter the amount to withdraw: ");

			int withdraw = sc.nextInt();

			atmfunctions.atmWithdraw(withdraw, person);

			break;
		}
		default:

			System.out.println("Invalid Entry");
		}

	}

}
