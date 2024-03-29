import org.junit.Test;
import static org.junit.Assert.*;
import java.util.BitSet;

public class TestBitSet {

	// (A1, B1): create a BitSet, set a value in position X in the range of the
	// BitSet, get position X (true), flip position X, get position X (false)
	@Test
	public void testHappyCase() {
		BitSet bitSet = new BitSet(10);
		bitSet.set(5);
		assertTrue(bitSet.get(5));
		bitSet.flip(5);
		assertFalse(bitSet.get(5));
	}

	// (A1, B2): create a BitSet, get position X in the range of the BitSet, flip
	// position X, get position X (true)
	@Test
	public void testFlipAndGet() {
		BitSet bitSet = new BitSet(10);
		assertFalse(bitSet.get(4));
		bitSet.flip(4);
		assertTrue(bitSet.get(4));
	}

	// (A1, B3): create a BitSet, try to get a negative position
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNegativePosition() {
		BitSet bitSet = new BitSet(10);
		bitSet.get(-1);
	}

	// (A1, B4): create a BitSet, try to set a negative position
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetNegativePosition() {
		BitSet bitSet = new BitSet(10);
		bitSet.set(-1);
	}

	// (A1, B5): create a BitSet, try to flip a negative position
	@Test(expected = IndexOutOfBoundsException.class)
	public void testFlipNegativePosition() {
		BitSet bitSet = new BitSet(10);
		bitSet.flip(-1);
	}

	// (A2, B1): create an empty BitSet, set a value in position X in the range of
	// the BitSet, get position X (true), flip position X, get position X (false)
	@Test
	public void testEmptyBitSet() {
		BitSet bitSet = new BitSet(0);
		System.out.println("-> " + bitSet.length()); // print for debug console showing the size of the bitset = 0
		bitSet.set(1);
		System.out.println("-> " + bitSet.length()); // print for debug console showing the size of the bitset = 2
		assertTrue(bitSet.get(1));
		bitSet.flip(1);
		assertFalse(bitSet.get(1));
	}

	// (A2, B2): create an empty BitSet, get position X in the range of the BitSet,
	// flip position X, get position X (true)
	@Test
	public void testEmptyBitSetFlipAndGet() {
		BitSet bitSet = new BitSet(0);
		System.out.println("-> " + bitSet.length()); // print for debug console showing the size of the bitset = 0
		assertFalse(bitSet.get(1));
		bitSet.flip(1);
		System.out.println("-> " + bitSet.length()); // print for debug console showing the size of the bitset = 2
		assertTrue(bitSet.get(1));
	}

	// (A2, B3): create an empty BitSet, try to get a negative position
	@Test(expected = IndexOutOfBoundsException.class)
	public void testEmptyBitSetGetNegativePosition() {
		BitSet bitSet = new BitSet(0);
		bitSet.get(-1);
	}

	// (A2, B4): create an empty BitSet, try to set a negative position
	@Test(expected = IndexOutOfBoundsException.class)
	public void testEmptyBitSetSetNegativePosition() {
		BitSet bitSet = new BitSet(0);
		bitSet.set(-1);
	}

	// (A2, B5): create an empty BitSet, try to flip a negative position
	@Test(expected = IndexOutOfBoundsException.class)
	public void testEmptyBitSetFlipNegativePosition() {
		BitSet bitSet = new BitSet(0);
		bitSet.flip(-1);
	}

	// (A3): try to create a BitSet with negative length
	@Test(expected = NegativeArraySizeException.class)
	public void testNegativeLength() {
		BitSet bitSet = new BitSet(-1);
	}

}
