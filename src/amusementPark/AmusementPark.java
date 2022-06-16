package amusementPark;

import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person p1= new Person(); 
		
		AmusementParkEligibility pp1 =new AmusementParkEligibility();
		
		System.out.println(" Enter height: ");
		
		p1.height = sc.nextInt();
		
		System.out.println("Enter Weight: ");
		
		p1.weight = sc.nextInt();
		
		pp1.eligibilityCheck(p1.height, p1.weight);
		
		System.out.println();
		
	}

}
