package encapsulation;

import java.util.Scanner;

public class CRA {

	boolean craAuthentication() {

		boolean isPassCorrect = false;

		Scanner sc = new Scanner(System.in);

		int[] craPasswords = new int[3];

		craPasswords[0] = 5321;

		craPasswords[1] = 1234;

		craPasswords[2] = 2544;

		System.out.println("Enter your password: ");

		int pass = sc.nextInt();

		for (int i = 0; i <3; i++) {

			if (pass == craPasswords[i]) {

				System.out.println("Password Correct \nYou are authorise to access");
				
				isPassCorrect=true;

				break;
			} 
			

		}
		if (!isPassCorrect) {
			
			System.out.println("You are not authorised to access");
		}
		
		return isPassCorrect;
	}

}
