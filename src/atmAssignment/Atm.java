package atmAssignment;

public class Atm {

	final int dailycashlimit = 2000;

	void atmDeposit(int amount, Person person) {

		int finalBalance = person.DepositBalance(amount, person);

		System.out.println(amount + " Deposited to " + person.accountType + "Account");

		System.out.println("Name: " + person.accountHolderName);

		System.out.println("Account Number: " + person.accountNumber);

		System.out.println("Account Type: " + person.accountType);

		System.out.println("New Balance =" + finalBalance);

	}

	void atmWithdraw(int amount, Person person) {

		if (amount > dailycashlimit) {

			System.out.println("Daily Limit Exceeded");
		} else {

			System.out.println("Transaction Processing");

			int finalBalance = person.withdrawBalance(amount, person);

			System.out.println("Name: " + person.accountHolderName);

			System.out.println("Account Number: " + person.accountNumber);

			System.out.println("Account Type: " + person.accountType);

			System.out.println("New Balance =" + finalBalance);

		}
	}

}