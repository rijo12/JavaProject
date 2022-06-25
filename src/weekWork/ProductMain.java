package weekWork;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String decision = "";

		int amount = 0;

		int totalAmount = 0;

		Product product1 = new Product("product1", 5, "description1");
		Product product2 = new Product("product2", 10, "description2");
		Product product3 = new Product("product3", 15, "description3");
		Product product4 = new Product("product4", 20, "description4");
		Product product5 = new Product("product5", 25, "description5");
		Product product6 = new Product("product6", 30, "description6");
		Product product7 = new Product("product7", 35, "description7");
		Product product8 = new Product("product8", 40, "description8");
		Product product9 = new Product("product9", 45, "description9");
		Product product10 = new Product("product10", 50, "description10");

		Product[] arrayProduct = { product1, product2, product3, product4, product5, product6, product7, product8,
				product9, product10 };

		do {

			System.out.println("Enter the Product Name ");

			String productName = sc.next();

			for (int i = 0; i <arrayProduct.length; i++) {

				if (productName.equals(arrayProduct[i].name) ) {

					System.out.println("Enter Quantity: ");

					int quantity = sc.nextInt();

					Invoice object = arrayProduct[i].invoice1();

					amount = object.invoiceSummary(arrayProduct[i].pricePerUnit, quantity);

					totalAmount = totalAmount + amount;

					break;

				}
			}
			System.out.println("add another product(y/n): ");

			decision = sc.next();

		} while (decision.equals("y"));

		System.out.println("Total Amount= " + totalAmount);
	}
}
