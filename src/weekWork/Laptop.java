package weekWork;

public class Laptop {

	String laptopName;
	int ramSize;
	String processorType;

	void laptopVariableIntializationUsingMethod(String laptopName1, int ramSize1, String processorType1 ) {
		
		
		System.out.println(laptopName1+ ramSize1 + processorType1);
			
		
	}
	Laptop() {
		
	}
	
	Laptop(String name, int a, String processor){
		
		laptopName= name;
		
		ramSize= a;
		
		processorType= processor;
		
		
		
		
	}

}
