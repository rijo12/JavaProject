package weekWork;

public class Product {
	
	String name;
	
	int pricePerUnit;
	
	String description;

	
	Product(String name1, int price, String des){
		
		name= name1;
		
		pricePerUnit = price;
		
		description = des;
		
		
	}
	
	Product(){
		
	}
	
	Invoice invoice1() {
		
		
		Invoice objectReturn = new Invoice();
		
		return objectReturn;
		
	}

}
