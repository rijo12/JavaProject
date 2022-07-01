package AtmAssignmentUpdated;

public class AtmMain {

	public static void main(String[] args) {

		PersonDetails[] person = new PersonDetails[5];//array created with index 5 to store 5 person's details

		person[0] = new PersonDetails(12345, "Rijo", 12000, "Chequing", 1234); // Array is populated.

		person[1] = new PersonDetails(26522, "Shijo", 15000, "Chequing", 5678);

		person[2] = new PersonDetails(56586, "Albin", 20000, "Savings", 2525);

		person[3] = new PersonDetails(23635, "Jerin", 25000, "Savings", 2365);

		person[4] = new PersonDetails(36563, "Jerin", 30000, "Chequing", 8785);

		Atm atmFunctions = new Atm(); // created an atmFunctions object for Atm class

		boolean pincheck = atmFunctions.AtmidentityCheck(person);// Called the function AtmidentityCheck with passing person details

		if (pincheck) {

			atmFunctions.atmWithdrawDeposit(person); // called the method atmWithdrawDeposit 
		} else {

			System.out.println("Sorry");
		}
	}

}
