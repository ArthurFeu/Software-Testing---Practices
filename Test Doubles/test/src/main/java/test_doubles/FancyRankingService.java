package test_doubles;

public class FancyRankingService implements RankingService {
	@Override
	public int getRank(Customer customer) {
		// Fictional implementation from a third party system
		return 5;
	}
}
