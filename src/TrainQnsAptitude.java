//A train running at the speed of 60 km/hr crosses a pole in 9 seconds. 
//What is the length of the train?

public class TrainQnsAptitude {

	public static void main(String[] args) {
		int time = 9;
		int speedOfTrain = 60;
		double speedMPerSec = speedOfTrain * 0.28;
		double lengthOfTrain = time * speedMPerSec;
		System.out.println("Length of the Train in m =" + lengthOfTrain);
	}

}
