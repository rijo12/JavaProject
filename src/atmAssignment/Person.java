package atmAssignment;

public class Person {

	long accountNumber;
	String accountHolderName;
	private int fundsAvailable;
	String accountType;
	private int pin;

	Person(long accNum, String name, int fund, String account, int pi) {

		accountNumber = accNum;

		accountHolderName = name;

		fundsAvailable = fund;

		accountType = account;

		pin = pi;

	}

	boolean pinCorrect(int pin, Person person) {

		if (person.pin == pin) {

			System.out.println("Pin Number correct");

			return true;

		} else
			return false;

	}

	int DepositBalance(int amount, Person person) {

		int finalbalance = person.fundsAvailable + amount;

		return finalbalance;

	}

	int withdrawBalance(int amount, Person person) {

		int finalBalance = person.fundsAvailable - amount;

		return finalBalance;

	}

}
