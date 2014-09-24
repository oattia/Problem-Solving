import java.util.Scanner;

public class threeNplus1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {

			int num1 = input.nextInt();
			int num2 = input.nextInt();

			int L = Math.min(num1, num2);
			int H = Math.max(num1, num2);

			int count = 0, maxCount = 0;

			for (int i = H; i >= L; i--) {

				count = 1;

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

				if (count > maxCount) {
					maxCount = count;
				}
			}

			System.out.println(num1 + " " + num2 + " " + maxCount);

		}

	}

}
