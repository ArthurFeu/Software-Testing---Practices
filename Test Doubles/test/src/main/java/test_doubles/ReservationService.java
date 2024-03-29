package test_doubles;

public class ReservationService {
	// Default implementation of the fancy ranking service
	private RankingService rankingService = new FancyRankingService();

	// Method to inject a fake ranking service for testing
	public void setRankingService(RankingService rankingService) {
		this.rankingService = rankingService;
	}

	public int reserve(Customer customer) {
		int rank = rankingService.getRank(customer);
		// Demo use of reservation service
		System.out.println("Reserving for " + customer.getName() + " with rank " + rank);
		return rank;
	}
}
