package thursdayWork;

public class Invoice {
	
	double total = 0;
	
	double calculateInvoiceTotal(Product[] product) {

		
		for (int i = 0; i < product.length; i++) {

			total += product[i].quantity * product[i].pricePerunit;

		}
		return total;
	}

	
	double calculateInvoiceTotalWithTax(Product[] product) {
		
		double totalWithTax=0;
		
		for (int i = 0; i < product.length; i++) {

			total += product[i].quantity * product[i].pricePerunit;
			
			totalWithTax = total+ (total*0.13);
		}
		
		return totalWithTax;
		
	}
}
