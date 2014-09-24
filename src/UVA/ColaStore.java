import java.util.Scanner;

public class ColaStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		while (true) {

			int empty = input.nextInt();

			if (empty == 0)
				break;

			int ex = empty;

			int drinked = 0;

			while (ex > 1) {

				drinked += ex / 3;

				ex = ex / 3 + ex % 3;

				if (ex < 3 && ex > 1)
					ex = 3;

			}

			System.out.println(drinked);
		}

	}

}
