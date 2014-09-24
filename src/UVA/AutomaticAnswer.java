import java.util.Scanner;

public class AutomaticAnswer {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		String x = "";

		char c;

		for (int j = 0; j < t; j++) {

			int n = input.nextInt();

			int exp = (((((n * 567) / 9) + 7492) * 235) / 47) - 498;

			x = Integer.toString(exp);

			c = x.charAt(x.length() - 2);

			System.out.println(c);
		}

	}

}
