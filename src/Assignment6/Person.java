package Assignment6;

public class Person {
	
	int weight;
	int height;
	
	
	void EligibilityCheck(int enteredWeight,int enteredHeight )
	{
		if (enteredWeight>15 && enteredWeight<95 && enteredHeight>90 && enteredHeight<200) {
			
			System.out.println("Allowed to enter");
			
		}
		else {
			System.out.println("Not Allowed");
		}
	}

}
