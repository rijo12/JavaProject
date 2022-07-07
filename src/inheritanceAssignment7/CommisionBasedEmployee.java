package inheritanceAssignment7;

public class CommisionBasedEmployee extends Employee {

	public CommisionBasedEmployee(String firstName, String lastName, int sinNumber, double hoursWorked,
			double hourlyWage) {
		super(firstName, lastName, sinNumber, hoursWorked, hourlyWage);

	}

	@Override
	void employeePay(double hoursWorked, double hourlyWage) {

		setSalary((getHoursWorked() * getHoursWorked()) + (0.15 * ((getHoursWorked() * getHoursWorked()))));

	}

}
