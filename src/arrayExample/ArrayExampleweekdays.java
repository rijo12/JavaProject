package arrayExample;

import java.util.Arrays;

public class ArrayExampleweekdays {

	public static void main(String[] args) {
		String[] daysInAWeek = new String[7];
		System.out.println(Arrays.toString(daysInAWeek));
		daysInAWeek[0]= "Monday";
		daysInAWeek[6]="Sunday";
		System.out.println("Days are"+Arrays.toString(daysInAWeek));
		
		
		int[] numbers= new int[100];
		System.out.println(Arrays.toString(numbers));
		
		boolean[] condition= new boolean[15];
		System.out.println(Arrays.toString(condition));
	}

}