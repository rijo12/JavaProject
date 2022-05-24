package assignment3;

public class License {

	public static void main(String[] args) {
		int age = 18;
		boolean completedWrittenTest= true;
		boolean currentLicenseG1 = false;
		boolean currentLicenseG2 = false;
		boolean currentLicenseG = false;
		boolean ageCondition = age >= 18;
		
      //age>=18 and completed written test, Eligible to attennd G1 
		if (ageCondition && completedWrittenTest && !currentLicenseG1 && !currentLicenseG2 && !currentLicenseG) {
			
			System.out.println("Eligible to get the License G1");
		}
		
	   // G1 License Holder	
		else if (currentLicenseG1 && ageCondition && completedWrittenTest ) {

			System.out.println("Eligible to get G2");
		}
  
	// G2 License Holder
		else if (currentLicenseG2 && ageCondition && completedWrittenTest) {

			System.out.println("Eligible to get G");
		} 
		// G License Holder
		else if (currentLicenseG && ageCondition && completedWrittenTest) {
			System.out.println("You have a valid License");

		} 
		else {
			System.out.println(" Not Eligible");
		}
	}

}
