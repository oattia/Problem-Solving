import java.util.Scanner;

public class LumberjackSequencing {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {

			if (i == 0) {
				System.out.println("Lumberjacks:");
			}
			boolean b = true;
			boolean c = true;

			int[] x = new int[10];

			for (int j = 0; j < 10; j++) {

				x[j] = input.nextInt();
			}

			for (int h = 0; h < 8; h++) {

				if (!(x[h] <= x[h + 1])) {
					b = false;
					break;
				}

			}

			for (int v = 0; v < 8; v++) {

				if (!(x[v] >= x[v + 1])) {
					c = false;
					break;
				}

			}

			if (c || b) {
				System.out.println("Ordered");
			} else {
				System.out.println("Unordered");
			}

		}

	}
}
