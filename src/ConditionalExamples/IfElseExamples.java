package ConditionalExamples;

public class IfElseExamples {

	public static void main(String[] args) {
		int totalSeats = 1000;
		int seatsBooked = 500;
		int requiredSeats = 501;
		
		if (requiredSeats <= (totalSeats - seatsBooked)) {
			System.out.println("TicketBooked");
		}
		else {
			System.out.println("Tickets not available");
		}
		
		}
			
	}


