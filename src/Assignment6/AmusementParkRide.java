package Assignment6;

import java.util.Scanner;

public class AmusementParkRide {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person rijo = new Person();
		
		System.out.println("Enter the Weight in Kg:");
		
		rijo.weight= sc.nextInt();
		
		int enetredWeight= rijo.weight;
		
		System.out.println("Enter the Height in cm:");
		
		rijo.height= sc.nextInt();
		
		int enetredHeight= rijo.height;
		
		rijo.EligibilityCheck(enetredWeight, enetredHeight);

	}

}
