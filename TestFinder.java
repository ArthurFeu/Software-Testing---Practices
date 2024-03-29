import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Assert;

import java.util.Collection;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class TestFinder {
	private int[] array;
	private int element;
	private int expected;

	public TestFinder(int[] array, int element, int expected) {
		this.array = array;
		this.element = element;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 5, 4 },
				{ new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0, -1 },
				{ new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 9, -1 },
				{ new int[] { -1, -2, -3, -4, -5, -6, -7, -8 }, -1, 0 },
				{ new int[] { 10000000 }, 10000000, 0 },

		});
	}

	@Test
	public void testFirstElement() {
		Assert.assertThat(Finder.firstElement(array, element), is(equalTo(expected)));
	}
}
