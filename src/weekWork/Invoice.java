package weekWork;

public class Invoice {

	int quantity;


	int amount;

	int invoiceSummary(int price, int quantity) {

		amount = price * quantity;

		return amount;

	}

}
