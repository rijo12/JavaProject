package Assignment6;

public class Employee {
	
	String firstName;
	String lastName;
	double hourlyRate;
	
	
	double salaryCaculation(double hoursWorked) {
		
		double salary=  hourlyRate*hoursWorked;
		
		return salary;
		
	}

}
