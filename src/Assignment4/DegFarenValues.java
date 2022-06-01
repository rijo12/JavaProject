package Assignment4;

import java.util.Scanner;

public class DegFarenValues {

	public static void main(String[] args) {
		double inputTemp=-1; //  variable assigned to a negative value , then only it accepts negative inputs.
		double resultTemp=0;
		String degFaren="";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Convert Celsius to Farenheit? (yes/no) / Enter 0 for Temperature Values");
		
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
		if (degFaren.equals("0")) { // Dispaly Celsius and Farenheit Values
			
			System.out.println("Celsius      Farenheit");
			
				for(double j=-4;j<=5;j++) {
					
					resultTemp = (j*5)*1.8+32;
					
					System.out.println(+j*5+"           "+resultTemp);
				}
											
		}
		
	}

}
