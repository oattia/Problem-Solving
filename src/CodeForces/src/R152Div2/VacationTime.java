public class VacationTime {

	public static int bestSchedule(int N, int K, int[] workingDays) {

		int count = 0, maxcount = 0;

		boolean found = true;

		for (int i = 1; i <= N; i++) {

			count = 0;

			for (int j = 0; j < workingDays.length; j++) {

				if (i != workingDays[j] && (i + 1) != workingDays[j]) {
					count++;
				}
			}

			if (count >= maxcount) {
				maxcount = count;
			}
		}

		return maxcount;

	}

	public static void main(String[] args) {

		int x[] = { 7, 4, 5, 6, 2 };

		int b = bestSchedule(9, 2, x);

		System.out.println(b);
	}
}
