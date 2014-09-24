import java.util.Scanner;

public class Cola {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {

			int empty = input.nextInt();

			int ex = empty;

			int drinked = 0;

			while (ex > 1) {

				drinked +=  ex / 3;

				ex = ex / 3 + ex % 3;

				if (ex < 3 && ex > 1)
					ex = 3;

			}

			drinked += empty ;
			
			System.out.println(drinked);
		}

	}

}
