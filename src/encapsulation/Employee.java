package encapsulation;

public class Employee {
	
private int sinNumber ;
	
	private double salary;
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int sinNumber) {
		this.sinNumber = sinNumber;
	}

	public int getSinNumber() {
		return sinNumber;
	}
	
	//Change to public void setSinNumber(int sinNumber, CRA cra, int pin)

	public void setSinNumber(int sinNumber) {
		
			this.sinNumber = sinNumber;
			
		
	}


}
