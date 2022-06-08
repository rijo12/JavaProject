package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBrands {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String phoneBrandName = "";

		String productSelected = "";

		String select= "";
		
		boolean ProductNameCorrect= false;
		
		boolean brandCorrect= false;
		
		do {
		
		System.out.println("Enter the Phone Brand in Lower case Letter(samsung/ google/apple):");

		phoneBrandName = sc.next();

		switch (phoneBrandName) {

		case "samsung":{
			

			String[] samsungPhones = { "s20", "s21", "flip3", "fold3" };

			
			do {
			
				System.out.println("Samsung Phone Categories:" + Arrays.toString(samsungPhones));
				
				System.out.println("Pls Select one of the product:");
			
				productSelected = sc.next();
				
				for(int c=0;c<samsungPhones.length;c++) {

				if (productSelected.equals(samsungPhones[c])) {

					select = samsungPhones[c];
					
					ProductNameCorrect=true;

					System.out.println("Product Selected: " + select);
				
				}
				
				}
				
			}while(!ProductNameCorrect);
			
			break;
		}
			
		case "google":{

			String[] googlePhones = { "googlepixel6", "googlepixel6 pro", "googlepixelpro", "googlepixel5" };

			do {
				
				System.out.println("google Phone Categories:" + Arrays.toString(googlePhones));
				
				System.out.println("Pls Select one of the product:");
			
				productSelected = sc.next();
				
				for(int c=0;c<googlePhones.length;c++) {

				if (productSelected.equals(googlePhones[c])) {

					select = googlePhones[c];
					
					ProductNameCorrect=true;

					System.out.println("Product Selected: " + select);
				
				}
				
				}
				
			}while(!ProductNameCorrect);
			
			break;
		}
		case "apple":{

			String[] applePhones = { "iphone12", "iphone12mini", "iphone11", "iphone11mini" };

			do {
				
				System.out.println("apple Phone Categories:" + Arrays.toString(applePhones));
				
				System.out.println("Pls Select one of the product:");
			
				productSelected = sc.next();
				
				for(int c=0;c<applePhones.length;c++) {

				if (productSelected.equals(applePhones[c])) {

					select = applePhones[c];
					
					ProductNameCorrect=true;

					System.out.println("Product Selected: " + select);
				
				}
				
				}
				
			}while(!ProductNameCorrect);
			
			break;
		}
		default:

			System.out.println("Invalid Entry");
		
		}
		
	}while(!brandCorrect);

}
}