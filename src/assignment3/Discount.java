package assignment3;

public class Discount {

	public static void main(String[] args) {
		int productPrice = 10;
		double finalDiscountedPrice;
		double discountPrice;
		double generalDiscount = 0.5;
		boolean promoApplied = true;
		boolean promo5 = true;
		boolean promo10 = false;
		boolean promo20 = false;

		if (promoApplied && promo5) {

			discountPrice = productPrice -(productPrice * generalDiscount );
			finalDiscountedPrice = discountPrice- (productPrice *0.05);
			System.out.println(" Final Price with additional 5% Discount=" + finalDiscountedPrice);

		}

		else if (promoApplied && promo10) {

			discountPrice = productPrice -(productPrice * generalDiscount );
			finalDiscountedPrice = discountPrice- (productPrice *0.1);
			System.out.println(" Final Price with additional 10% Discount=" + finalDiscountedPrice);
		} 
		
		else if (promoApplied && promo20) {

			discountPrice = productPrice -(productPrice * generalDiscount );
			finalDiscountedPrice = discountPrice- (productPrice *0.2);
			System.out.println(" Final Price with additional 20% Discount=" + finalDiscountedPrice);
		} 
		
		else {
			finalDiscountedPrice = productPrice -(productPrice * generalDiscount);
			System.out.println(" Final Price without promo=" + finalDiscountedPrice);
		}
	}

}
