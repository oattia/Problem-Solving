import java.util.Scanner;

public class Queen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		while (true) {

			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();

			if (x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0)
				break;

			if (x1 == x2 && y1 == y2) {
				System.out.println(0);
			} else if (x1 == x2 || y1 == y2
					|| Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}

		}

	}

}
