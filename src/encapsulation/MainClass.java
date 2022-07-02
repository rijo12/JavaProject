package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		Employee employee = new Employee(89795);
		boolean isCRA = true;
		
		System.out.println("Sin num :"+employee.getSinNumber());
		
//		employee.setSinNumber(23456, true,6666);

		System.out.println("Sin num :"+employee.getSinNumber());
		
//		employee.setSinNumber(342432,false,1234);
		
		System.out.println("Sin num :"+employee.getSinNumber());
		
		//only CRA can change the SIN Number
		
		CRA cra = new CRA();
		
		boolean passcheck=cra.craAuthentication();
		
		if(passcheck) {
		
		employee.setSinNumber(23456);

		System.out.println("Sin num :"+employee.getSinNumber());
		
		}
	
		
	}

	}


