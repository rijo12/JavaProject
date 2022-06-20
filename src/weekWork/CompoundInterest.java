package weekWork;

public class CompoundInterest {
	
	double principal;
	
	int rate;
	
	int time;
	
	double Calculaton(double principal, int rat, int time) {
		
		rate= rat/100;
		
		double result=(principal*((1+(rate/12))^(12*time)));
		
		return result;
		
		
	}


}
