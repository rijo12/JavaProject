
public class Salary {

	public static void main(String[] args) {
		int hourlyRate = 14;
		int dailyHours = 8;
		int workDays = 5;
		double tax = 0.13;
		int totalHours = dailyHours * workDays;
		int totalSalary = hourlyRate * totalHours;
		double taxDeductions = totalSalary * tax;
		double takeHomeSalary = totalSalary - taxDeductions;
		System.out.println("Weekly Salary=" + takeHomeSalary);

	}

}
