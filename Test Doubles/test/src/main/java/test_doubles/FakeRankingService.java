package test_doubles;

public class FakeRankingService implements RankingService {
	@Override
	public int getRank(Customer customer) {
		// Fake implementation for testing purposes
		return 1;
	}
}
