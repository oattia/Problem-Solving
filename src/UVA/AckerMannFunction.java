import java.util.Scanner;

public class AckerMannFunction {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {

			int num1 = input.nextInt();
			int num2 = input.nextInt();

			if (num1 == 0 && num2 == 0)
				break;

			int L = Math.min(num1, num2);
			int H = Math.max(num1, num2);

			int count = 0, maxCount = 0, max = 0;

			for (int i = H; i >= L; i--) {

				count = 0;

				for (int j = i; j >= 1;) {

					if (j % 2 == 0) {

						j = j / 2;
						count++;

						if (j == 1) {
							break;
						}

					} else {

						j = 3 * j + 1;
						count++;

					}

				}

				if (count >= maxCount) {
					maxCount = count;
					max = i;
				}
			}

			System.out.println("Between " + L + " and " + H + ", "
					+ (max) + " generates the longest sequence of " + maxCount
					+ " values.");

		}

	}

}
