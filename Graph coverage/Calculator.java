public class Calculator {

	// Method to test with all def-use path criteria
	public static int calculateDiscount(int price, int customerYears, boolean isSpecialOffer) {
		int discount;
		if (isSpecialOffer) {
			discount = 20; // Special offer discount
		} else {
			discount = 10; // Base discount
		}
		if (customerYears > 5) {
			discount += 5; // Loyalty bonus
		}
		int finalPrice = price - (price * discount / 100);
		if (finalPrice < 0) {
			finalPrice = 0; // Ensure final price is not negative
		}
		return finalPrice;
	}

	public static void main(String[] args) {
		System.out.println(calculateDiscount(100, 6, true)); 
		System.out.println(calculateDiscount(100, 6, false));
		System.out.println(calculateDiscount(100, 4, true)); 
		System.out.println(calculateDiscount(100, 4, false));
	}
}
