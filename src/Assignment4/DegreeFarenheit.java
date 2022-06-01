package Assignment4;

import java.util.Scanner;

public class DegreeFarenheit {

	public static void main(String[] args) {
		double inputTemp=0;
		double resultTemp=0;
		String degFaren="";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Convert Celsius to Farenheit? (yes/no)");
		
		degFaren = sc.next();
		
		if(degFaren.equals("yes")) { // input temperature in Degree Celsius and output temperature in Degree Farenheit
			
			System.out.println("Enter the Degree Celsius Temperature ");
			
			inputTemp= sc.nextDouble();
			
			resultTemp = (inputTemp*1.8)+32;
			
			System.out.println("Temperature in Degree Farenheit: "+resultTemp);
		}
		
		if(degFaren.equals("no")) { // input temperature in Degree Farenheit and output temperature in Degree Celsius
			
			System.out.println("Enter the Degree Farenheit Temperature ");
			
			inputTemp= sc.nextDouble();
			
			resultTemp = (inputTemp-32)*0.55;
			
			System.out.println("Temperature in Degree Celsius: "+resultTemp);
		}
	}

}
