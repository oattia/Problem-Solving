import java.util.Scanner;

public class Back2Physics {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {

			int v = input.nextInt();

			int t = input.nextInt();

			double x;

				x = 2* v * t ;
					
			System.out.println ((int)x);

		}

	}

}
