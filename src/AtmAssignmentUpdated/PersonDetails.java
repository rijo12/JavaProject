package AtmAssignmentUpdated;

import java.util.Scanner;

import atmAssignment.Person;

public class PersonDetails {

	Scanner sc = new Scanner(System.in);

	int accountNumber;
	String accountHolderName;
	private int fundsAvailable; // Private modifier used
	String accountType;
	private int pin;
	final int dailycashlimit = 5000;  // final modifier used 

	PersonDetails(int accNum, String name, int fund, String account, int pi) {

		accountNumber = accNum;

		accountHolderName = name;

		fundsAvailable = fund;

		accountType = account;

		pin = pi;

	}

	boolean Pincheck(PersonDetails person) {

		boolean pinCheck = false;

		for (int j = 2; j >= 0; j--) {

			System.out.println("Enter pin Number");

			int pin = sc.nextInt();

			if (pin == person.pin) { // Checking the entered pin number is correct

				System.out.println("Pin Number correct");

				pinCheck = true;

				break;
			} else {
				pinCheck = false;
				System.out.println("You have " + j + " more attempts");
				if (j == 0) {

					System.out.println("Card Blocked");
				}
			}
		}

		return (pinCheck);
	}

	void DepositBalance(int deposit, PersonDetails person) {

		int finalBalance = person.fundsAvailable + deposit;

		System.out.println("New balance:" + finalBalance);

		System.out.println("Name: " + person.accountHolderName);

		System.out.println("Account Number: " + person.accountNumber);

		System.out.println("Account Type: " + person.accountType);

	}

	void withdrawBalance(int amount, PersonDetails person) {

		int finalBalance = 0;

		if (amount >= dailycashlimit) {

			System.out.println("Daily Limit Exceeded");
		}

		if ((amount < dailycashlimit) && (person.fundsAvailable > amount)) {

			finalBalance = person.fundsAvailable - amount;

			System.out.println("Transaction Processing");

			System.out.println("Name: " + person.accountHolderName);

			System.out.println("Account Number: " + person.accountNumber);

			System.out.println("Account Type: " + person.accountType);

			System.out.println("New Balance =" + finalBalance);

		}

		if (person.fundsAvailable < amount && amount < person.dailycashlimit) {

			System.out.println("Sorry\nInsufficient Balance");
		}

	}

}
