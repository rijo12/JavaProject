package inheritanceAssignment7;

public class ContractualEmployee extends Employee {

	public ContractualEmployee(String firstName, String lastName, int sinNumber, double hoursWorked,
			double hourlyWage) {
		super(firstName, lastName, sinNumber, hoursWorked, hourlyWage);

	}

	@Override
	void employeePay(double hoursWorked, double hourlyWage) {
		
		
		if (getHoursWorked()>40) {
			
			setSalary(((getHoursWorked()-40)*(getHourlywage()*1.5))+(40*getHoursWorked()));

		 
		}
		else {
			
			setSalary(getHoursWorked() * getHoursWorked());
		}
	}

}
