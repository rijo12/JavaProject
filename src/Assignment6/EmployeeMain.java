package Assignment6;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee rijo= new Employee();
		rijo.firstName= "Rijo";
		rijo.lastName="Cherian";
		rijo.hourlyRate = 15.25;
		
		System.out.println("Enter the number of hours worked: ");
		
		double hoursWorked= sc.nextDouble();
		
		double salary= rijo.salaryCaculation(hoursWorked);
		
		System.out.println("Employee First Name:" + rijo.firstName);
		System.out.println("Employee Last Name:" + rijo.lastName);
		System.out.println("Hourly Pay: "+rijo.hourlyRate);
		System.out.println("Total Salary: "+salary);
		
	}

}
