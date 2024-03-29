package test_doubles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReservationServiceTest {

	@Test
	public void testReservationServiceWithMockitoDummy() {
		// Mocking RankingService
		RankingService mockRankingService = mock(RankingService.class);
		ReservationService reservationService = new ReservationService();

		// Mock to simulate FakeRankingService
		when(mockRankingService.getRank(any(Customer.class))).thenReturn(1);

		reservationService.setRankingService(mockRankingService);

		Customer testCustomer = new Customer("Arthur Feu");
		int rankAfterReserve = reservationService.reserve(testCustomer);

		assertEquals(1, rankAfterReserve);

	}

	@Test
	public void testReservationService() {
		RankingService fakeRankingService = new FakeRankingService();
		ReservationService reservationService = new ReservationService();

		// Here I actually inject the fake ranking service

		reservationService.setRankingService(fakeRankingService);

		Customer testCustomer = new Customer("Arthur Feu");
		int rankAfterReserve = reservationService.reserve(testCustomer);

		assertEquals(1, rankAfterReserve);
	}
}
