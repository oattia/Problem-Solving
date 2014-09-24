import java.util.Scanner;

public class BigChoc {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int m = in.nextInt();
			int n = in.nextInt();

			System.out.println(m * n - 1);
		}
		in.close();

	}

}
