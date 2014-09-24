import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		int i = 1;

		while (i <= t) {

			int num = 0, x = 0;

			num = in.nextInt();

			for (int j = 0; j < num; j++) {

				int v = in.nextInt();

				if (v > x)
					x = v;

			}

			System.out.println("Case " + i + ": " + x);
			i++;
		}

	}

}
