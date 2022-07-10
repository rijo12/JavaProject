package randomGen;

import java.util.Random;

public class EmailRandom {

	public static void main(String[] args) {
		
		String emailAddress= "zxcvbnmasdfghjklqwertyuioop1234567!@#$%^&";
		
		int length= 8;
		
		String random="";
		
		Random randomEmailAddress = new Random();  // 
		
		char[] address = new char[length]; //Creating a char array with length 8
		
		for(int i=0;i<length;i++) { 
			
			address[i]= emailAddress.charAt(randomEmailAddress.nextInt(emailAddress.length())); // Selecting a random character and store it in the array
		}
		for(int j=0;j<address.length;j++) {
			
			random+=address[j];// 
		}
		System.out.println(random+"@gmail.com");
		

	}

}
