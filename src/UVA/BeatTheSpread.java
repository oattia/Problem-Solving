import java.util.Scanner;

public class BeatTheSpread {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t > 0) {

			int add = in.nextInt();
			int diff = in.nextInt();

			int x = (add + diff) / 2;

			int y = add - x;

			if (x - y == diff && x >= 0 && y >= 0)
				System.out.println(x + " " + y);
			else
				System.out.println("impossible");

			t--;
		}

	}

}
