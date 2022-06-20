package weekWork;

public class Laptop {

	String laptopName;
	int ramSize;
	String processorType;

	void laptopVariableIntializationUsingMethod() {
		
		
		laptopName = "Acer";
		
		ramSize = 8;
		
		processorType= "intel";
		
		System.out.println(laptopName+ ramSize + processorType);
			
		
	}
	Laptop() {
		
	}
	
	Laptop(String name, int a, String processor){
		
		laptopName= name;
		
		ramSize= a;
		
		processorType= processor;
		
		
		
		
	}

}
