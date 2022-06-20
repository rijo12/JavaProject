package weekWork;

public class CalculatorMain {

	public static void main(String[] args) {
		
		
		Calculator calculatorObject = new Calculator();
		
		System.out.println("Sum = "+calculatorObject.addition(10, 20));
		
		System.out.println("Subtraction Result = "+ calculatorObject.subtraction(100, 50));
		
		System.out.println("Multiplication Result= "+ calculatorObject.multiplication(20.1, 1.2));

		System.out.println("Division Result= "+ calculatorObject.division(5.3, 1.5));
	}

}
