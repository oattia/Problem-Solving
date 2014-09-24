import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] array = new int[n];

		int maxor;

		int xor;

		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}

		maxor = 0;

		for (int i = 0; i < array.length - 1; i++) {
			xor = array[i];
			for (int j = i + 1; j < array.length; j++) {

				xor ^= array[j];

				if (xor > maxor) {
					maxor = xor;

				}

			}

		}

		for (int i = 0; i < array.length; i++) {

			if (array[i] > maxor)
				maxor = array[i];

		}

		System.out.println(maxor);
	}
}
