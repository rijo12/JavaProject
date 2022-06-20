package weekWork;

public class LaptopMain {

	public static void main(String[] args) {
		
		Laptop objectInitialization =new Laptop();
		
		objectInitialization.laptopName= "hp";
		
		objectInitialization.processorType= "Core2Duo";
		
		objectInitialization.ramSize= 16;
		
		Laptop laptopMethod = new Laptop();
		
		laptopMethod.laptopVariableIntializationUsingMethod();
		
		Laptop laptopConstructor= new Laptop("hp", 16, "Atom");
		
		
	}

}
