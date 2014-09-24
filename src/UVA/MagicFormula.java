import java.util.Scanner;

public class MagicFormula {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, c, d, L;

		while (true) {

			int count = 0 ;
			
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			d = input.nextInt();
			L = input.nextInt();

			if (a == 0 && b == 0 && c == 0 && d == 0 && L == 0) {
				break;
			}

			for (int i = 0; i <= L; i++) {

				if ((a * (i * i) + b * i + c) % d == 0) {
					count++;
				}
			}

			System.out.println(count);
		}

	}
}
