import java.util.Scanner;

public class OddSum{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, t;

		t = input.nextInt();

		for (int j = 0; j < t; j++) {

			int sum = 0;
			a = input.nextInt();
			b = input.nextInt();

			for (int i = a; i <= b; i++) {

				if (i % 2 != 0) {
					sum += i;
				}

			}

			System.out.println("Case " + (j + 1) + ": " + sum);
		}

	}

}
