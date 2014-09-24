import java.util.Scanner;

public class Hashmatthebravewarrior {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {

			long x = input.nextLong();
			long y = input.nextLong();

			
			System.out.println(Math.abs(x-y));

		}

	}
}
