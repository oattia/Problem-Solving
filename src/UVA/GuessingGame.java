import java.util.Scanner;

public class GuessingGame {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {

			int index1 = 1;
			int index2 = 10;
			String num = in.nextLine();
			if (num.equals("0"))
				break;

			String xx = in.nextLine();

			if (num.compareTo("" + index2) >= 0
					|| num.compareTo("" + index1) <= 0) {
				System.out.println("Stan is dishonest");

			} else if (xx.equals("too high")) {
				index2 = Integer.parseInt(num) - 1;
				num = in.nextLine();
				xx = in.nextLine();
			} else if (xx.equals("too low")) {
				index1 = Integer.parseInt(num) + 1;
				num = in.nextLine();
				xx = in.nextLine();
			} else {
				System.out.println("Stan may be honest");
			}

		}

	}
}
