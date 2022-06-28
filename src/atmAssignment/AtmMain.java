package atmAssignment;

public class AtmMain {

	public static void main(String[] args) {

		Person[] persondetails = new Person[5];

		persondetails[0] = new Person(12345, "Rijo", 12000, "Chequing", 1234);

		persondetails[1] = new Person(26522, "Shijo", 15000, "Chequing", 5678);

		persondetails[2] = new Person(56586, "Albin", 20000, "Savings", 2525);

		persondetails[3] = new Person(23635, "Albin", 25000, "Savings", 2365);

		persondetails[4] = new Person(36563, "Jithin", 30000, "Chequing", 8785);

		Atm atmfunctions = new Atm();

		atmActivities atmcall = new atmActivities();

		atmcall.userdetails(persondetails, atmfunctions);

	}
}
