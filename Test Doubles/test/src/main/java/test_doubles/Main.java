package test_doubles;

public class Main {

	// Main to show the use of the FancyRankingService in the ReservationService
	public static void main(String[] args) {
		RankingService fancyRankingService = new FancyRankingService();
		ReservationService reservationService = new ReservationService();

		// Utilize the FancyRankingService in ReservationService
		reservationService.setRankingService(fancyRankingService);

		Customer customer = new Customer("Arthur Feu");
		reservationService.reserve(customer);
	}
}
