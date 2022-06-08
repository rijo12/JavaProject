package assignment5;

import java.util.Scanner;

public class CalculatorProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double firstNumber=0; 
		
		double secondNumber=0;
		
		double result=0;
		
		String operationToPerform="";
		
		System.out.println("Enter the First Number: ");
		
		firstNumber = sc.nextDouble();
		
		System.out.println("Enter the Second Number: ");

		secondNumber= sc.nextDouble();
		
		System.out.println("Enter the operation to perform(+,-,*,/)");
		
		operationToPerform= sc.next();
		
		switch(operationToPerform){
		
		case "+": result=firstNumber+secondNumber;
		
				System.out.println("Result = "+result);
				
				break;
		case"-": result=firstNumber-secondNumber;
		
				System.out.println("Result = "+result);
		
				break;
		case"*": result=firstNumber*secondNumber;
		
				System.out.println("Result = "+result);
		
				break;
		case"/": result=firstNumber/secondNumber;
		
		
				System.out.println("Result = "+result);
		
				break;
		default:
					System.out.println("Not a Valid operation");
		}		

	}

}
