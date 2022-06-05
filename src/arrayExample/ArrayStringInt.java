package arrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringInt {

	public static void main(String[] args) {

		
		String[] daysInAWeek =  {"5","2","3","4","5","6","7"}; //Initialization block
				//new String[7]; // length of an array

		
//		
//		int[] rollNos = new int[40]; 
//		
//		String[] addresses = new String[100];
//		
//		double[] salaries = new double[10];

		// rollNos[0] = 1;

		System.out.println(daysInAWeek);

		// Filling in/ Populate an array
		// int index =1;
		

//		daysInAWeek[0] = "Monday";
//		daysInAWeek[1] = "Tuesday";
//		
//		daysInAWeek[2] = "Wednesday";
//		daysInAWeek[3] = "Thursday";
//		
//		daysInAWeek[4] = "Friday";
//		daysInAWeek[5] = "Saturday";
//		
//		daysInAWeek[6] = "Sunday";

		System.out.println("Days in a week " + Arrays.toString(daysInAWeek));

		Scanner sc = new Scanner(System.in);

		System.out.println("Length of Array =" + daysInAWeek.length);

		// Arrayname.length
		// Populating the array using for loop

//		for (int i = 1; i <= daysInAWeek.length; i++) {
//
//			// int a = 2;
//
//			System.out.println("Enter the " + (i) + " day of the week");
//
//			daysInAWeek[i - 1] = sc.next();
//			// System.out.println(a);
//		}

		// System.out.println("Days in a week "+Arrays.toString(daysInAWeek));

		// Print an array without using Arrays.tostring ??
//		System.out.println("printing an array");
//		for(int i=1;i<=daysInAWeek.length;i++) {
//			System.out.println(daysInAWeek[i-1]);
//		
//		}
//		
		// if daysInAWeek contains 5 then print index at which 5 is stored
		int index =0;
		int counter =0;
		
		int[] indexArray = new int[daysInAWeek.length];
		
		for (int i = 0; i < daysInAWeek.length; i++) {

			if (daysInAWeek[i].equals("5")) {
				index =i;
				indexArray[i]=5;
				counter++;
				
				System.out.println("Index at which 5 is stored : "+i);
				
			}
		}
		
		// Print at which index 5 exists
		
		System.out.println("5 exists in array this no of times "+counter);
		
		System.out.println("5 exists at indexs "+Arrays.toString(indexArray));

		
	

}

	}


