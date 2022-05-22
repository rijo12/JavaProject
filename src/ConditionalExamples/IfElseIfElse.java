package ConditionalExamples;

public class IfElseIfElse {

	public static void main(String[] args) {
		boolean isNetworkAvailable= false;
		boolean isChargeAvailable=false;
		
		if (isNetworkAvailable) {
			System.out.println("calling posiible");
		}
		else if (isChargeAvailable) {
			System.out.println("Watch a Movie");
			}
		
		else {
			System.out.println(" only Emergency Calls");
			
		}
	}
	

}
