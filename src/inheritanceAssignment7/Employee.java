package inheritanceAssignment7;

public class Employee {

	private String firstName;
	private String lastName;
	private int sinNumber;
	private double hoursWorked;
	private double hourlywage;
	private double salary;

	public Employee(String firstName, String lastName, int sinNumber, double hoursWorked, double hourlyWage) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
		this.hoursWorked = hoursWorked;
		this.hourlywage = hourlyWage;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {

		if (salary > 0) {

			this.salary = salary;

		} else {
			salary = 0;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public int getSinNumber() {
		return sinNumber;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public double getHourlywage() {
		return hourlywage;
	}

	public String getLastName() {
		return lastName;
	}

	void employeePay(double hoursWorked, double hourlyWage) {

		setSalary(getHoursWorked() * getHourlywage());

	}

	void employeeDetails(String firstName, String lastName) {

		System.out.println("FirstName: " + firstName);

		System.out.println("LastName: " + lastName);

	}

}
