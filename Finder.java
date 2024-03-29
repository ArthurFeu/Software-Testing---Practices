public class Finder {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int element = 0;
		System.out.println(firstElement(x, element));
	}

	public static int firstElement(int[] x, int element) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == element) {
				return i;
			}
		}
		return -1;
	}
}