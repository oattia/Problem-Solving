public class ChildlessNumbers {

	public static int sum(int j) {

		String jj = "" + j;

		int sum = 0;

		for (int i = 0; i < jj.length(); i++) {
			sum += j % 10;
			j /= 10;
		}
		return sum;
	}

	public static int howMany(int A, int B) {

		int count = 0;

		for (int i = A; i <= B; i++) {

			for (int j = i; j <= 1000000000; j++) {

				if (sum(j) * i == j) {
					count++;
					break;
				}

			}

		}

		return (B - A + 1 - count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(howMany(275, 300));
	}

}
