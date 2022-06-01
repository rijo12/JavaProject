package Assignment4;

import java.util.Scanner;

public class HumanHeight {

	public static void main(String[] args) {
		double heightFeet=0;
		double heightInch=0;
		double heightInCm=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Height (feet)");// feet value stores in heightfeet
		heightFeet = sc.nextDouble();
	
		System.out.println("Enter the Height (inch)"); // inch value stores in heightinch
		heightInch = sc.nextDouble();
		
		heightInCm= (heightFeet*5)+(heightInch*9);
		System.out.println("Height in cm= "+heightInCm);
		
	}

}
