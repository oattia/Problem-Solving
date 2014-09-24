public class TheSimilarNumbers {

	public static int find(int lower, int upper) {

		int count = 0;

		for (int i = lower; i <= upper; i++) {

			if (hasSim(lower, upper, i)) {
				count++;
			}
		}

		return count;
	}

	private static boolean hasSim(int lower, int upper, int i) {

		for (int j = lower; j <= upper; j++) {
			if (sim(i, j))
				return true;

		}

		return false;
	}

	private static boolean sim(int i, int j) {

		if (i <= 10 * j && j <= 10 * i)
			return true;

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(5, 511));
	}

}
