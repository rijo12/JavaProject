package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTypeOfDeclaration {

	public static void main(String[] args) {
		// 1. Values directly enter to array
		
				String[] colors= {"Red","Green","Blue","Violet","Indigo","White","yellow"};// Initializing and populating array colors
				
				System.out.println("Length of the array :"+colors.length);
				
				System.out.println("Colors in the array are: "+Arrays.toString(colors));  // Print the contents of array
				
		//2. Values entered by using dynamic input
				
				String[] colorNames= new String[colors.length]; // Initializing array color names
				
				Scanner sc= new Scanner (System.in);
				
				for (int i=0;i<colors.length;i++) {   // Populating array
					
					System.out.println("Enter the colors: ");
					
					colorNames[i]= sc.next();	
					
				}
				
				System.out.println("Length of the array :"+colors.length);// Print the array length
				
				System.out.println(Arrays.toString(colorNames));	//// Print the contents of array	

	}

}
