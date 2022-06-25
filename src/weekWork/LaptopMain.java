package weekWork;

public class LaptopMain {

	public static void main(String[] args) {
		
		//STEP1
		
		Laptop objectInitialization =new Laptop();
		
		objectInitialization.laptopName= "hp";
		
		objectInitialization.processorType= "Core2Duo";
		
		objectInitialization.ramSize= 16;
		
		//STEP 2
		
		Laptop laptopMethod = new Laptop();
		
		laptopMethod.laptopVariableIntializationUsingMethod("Acer",32,"Intel i7");
		
		//STEP 3
		
		Laptop laptopConstructor= new Laptop("hp", 16, "Atom");
		
		
	}

}
