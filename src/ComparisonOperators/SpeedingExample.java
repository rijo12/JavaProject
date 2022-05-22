package ComparisonOperators;

public class SpeedingExample {

	public static void main(String[] args) {
		int speedAllowed= 100;
		int recordedSpeed= 120;
		boolean isSpeeding= recordedSpeed >speedAllowed;
		System.out.println("Overspeed="+isSpeeding);

	}

}
