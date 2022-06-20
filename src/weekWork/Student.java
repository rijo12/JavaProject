package weekWork;

public class Student {
	
	String studentName;
	
	int sub1;
	
	int sub2;
	
	int sub3;
	
	int sub4;
	
	int sub5;
	
	Student(){
		
		
	}

	Student(String name, int s1, int s2, int s3, int s4, int s5){
	
		studentName= name;
		
		sub1= s1;
		
		sub2= s2;
		
		sub3= s3;
		
		sub4= s4;
		
		sub5 = s5;
		
	}
	
	double percentageCalculation() {
		
		double percentage= ((sub1+sub2+sub3+sub4+sub5)/5);
		
		return percentage;
	}

}
