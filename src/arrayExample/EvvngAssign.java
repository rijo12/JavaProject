package arrayExample;

import java.util.Arrays;

public class EvvngAssign {

	public static void main(String[] args) {

		String[] daysInAWeek = { "5", "2", "6", "5", "7", "8", "5" };

		System.out.println(Arrays.toString(daysInAWeek));

		System.out.println("Length of the Array= " + daysInAWeek.length);

		int index = 0;

		int counter = 0; 
		
		int[] indexArray = new int[daysInAWeek.length];

		for (int i = 0; i < daysInAWeek.length; i++) {

			if (daysInAWeek[i].equals("5")) {

				index = i+1;
				indexArray[i] = 5;
				counter++;

				System.out.println("Index at which 5 is stored: " + index);

			}

		}

		System.out.println("5 exists in array this no of times: " + counter);
		
		System.out.println("5 exists at indexes:" + Arrays.toString(indexArray));
	}

}
