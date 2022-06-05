package arrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class CityNames {

	public static void main(String[] args) {
		
		String userOption="";
		Scanner sc= new Scanner(System.in);
		
		String[] cityNamesInOntario =new String[3];
		
		for(int i=0;i<cityNamesInOntario.length;i++) {
			
			System.out.println("Enter The city Names");
			
			cityNamesInOntario[i]=sc.next();
		}
		
		System.out.println(Arrays.toString(cityNamesInOntario));
		
		
		System.out.println("Enter a city Name ");
		
		userOption= sc.next();
	
	for (int i=0;i<cityNamesInOntario.length;i++) {
		
		
	if (userOption.equals(cityNamesInOntario[i])) {
			
		System.out.println("Welecome to"+ userOption);
		
					
		}
	System.out.println("Enter a city name");
	
	userOption=sc.next();
		
	if (!userOption.equals(cityNamesInOntario[i])) {
		
		System.out.println("Not a Valid Input");
	}
	
	System.out.println("Enter the city to swap");
	
		if (userOption.equals(cityNamesInOntario[i])) {
			
			System.out.println("Replace with"+cityNamesInOntario[1]);
			
			break;
			
		}
	}
	
	
	
	}

}
