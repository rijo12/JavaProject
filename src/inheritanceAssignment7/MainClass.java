package inheritanceAssignment7;

public class MainClass {

	public static void main(String[] args) {

		PermanentEmployee[] permEmplo = new PermanentEmployee[5];

		permEmplo[0] = new PermanentEmployee("Nitin", "Jain", 123456, 40, 21.22);
		permEmplo[1] = new PermanentEmployee("Pranav", "Hegde", 552255, 40, 25.25);
		permEmplo[2] = new PermanentEmployee("Supriya", "Galav", 778855, 40, 30.21);
		permEmplo[3] = new PermanentEmployee("Rahul", "Kanwal", 523651, 35, 65.21);
		permEmplo[4] = new PermanentEmployee("Nikhil", "Mathur", 256878, 40, 50.12);

		ContractualEmployee[] ContractEmplo = new ContractualEmployee[3];

		ContractEmplo[0] = new ContractualEmployee("Vinay", "Sharma", 253642, 48, 32.21);
		ContractEmplo[1] = new ContractualEmployee("Shobit", "Arora", 235631, 44, 25.25);
		ContractEmplo[2] = new ContractualEmployee("Varsha", "Vats", 878521, 52, 28.21);

		CommisionBasedEmployee[] CommisionEmplo = new CommisionBasedEmployee[2];

		CommisionEmplo[0] = new CommisionBasedEmployee("Milan", "Sharma", 215787, 42, 32.21);
		CommisionEmplo[1] = new CommisionBasedEmployee("Abhishek", "Anand", 858572, 40, 37.55);

		for (int i = 0; i < permEmplo.length; i++) {

			permEmplo[i].employeePay(permEmplo[i].getHoursWorked(), permEmplo[i].getHourlywage());

			permEmplo[i].employeeDetails(permEmplo[i].getFirstName(), permEmplo[i].getLastName());

			System.out.println("Total Salary: " + permEmplo[i].getSalary());
		}

		for (int j = 0; j < ContractEmplo.length; j++) {

			ContractEmplo[j].employeePay(ContractEmplo[j].getHoursWorked(), ContractEmplo[j].getHourlywage());

			ContractEmplo[j].employeeDetails(ContractEmplo[j].getFirstName(), ContractEmplo[j].getLastName());

			System.out.println("Total Salary: " + ContractEmplo[j].getSalary());
		}

		for (int k = 0; k < CommisionEmplo.length; k++) {

			CommisionEmplo[k].employeePay(CommisionEmplo[k].getHoursWorked(), CommisionEmplo[k].getHourlywage());

			CommisionEmplo[k].employeeDetails(CommisionEmplo[k].getFirstName(), CommisionEmplo[k].getLastName());

			System.out.println("Total Salary: " + CommisionEmplo[k].getSalary());
		}

	}
}
