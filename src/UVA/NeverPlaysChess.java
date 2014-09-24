import java.util.Scanner;

public class NeverPlaysChess {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int c = 0; c < t; c++) {

			long n = input.nextLong();

			long s = (long) ((Math.sqrt(1 + 8 * n) - 1) / 2);

			System.out.println(s);

		}

	}

}
