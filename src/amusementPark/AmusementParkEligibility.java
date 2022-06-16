package amusementPark;

public class AmusementParkEligibility {
	
	void eligibilityCheck(int enteredWeight,int enteredHeight )
	{
		if (enteredWeight>15 && enteredWeight<95 && enteredHeight>90 && enteredHeight<200) {
			
			System.out.println("Allowed to enter");
			
		}
		else {
			System.out.println("Not Allowed");
		}
	}

}
