package thursdayWork;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		Product[] selectedProducts =  new Product[3];
		
		Scanner sc = new Scanner(System.in);
		
		Invoice invoice = new Invoice();

		double invoiceTotal =0;
		
		double invoiceTotalWithTax=0;

		selectedProducts[0] = new Product("Milk",5.0,"Organic",1);
		selectedProducts[1] = new Product("Bread",2.0,"Whole wheat",2);
		selectedProducts[2] = new Product("Butter",5.0,"Organic",2);


		invoiceTotal = invoice.calculateInvoiceTotal(selectedProducts);
		
		System.out.println("Total Amount:"+invoiceTotal);
		
		invoiceTotalWithTax = invoice.calculateInvoiceTotalWithTax(selectedProducts);
		
		System.out.println("Total with Tax = "+ invoiceTotalWithTax);

	}

}
