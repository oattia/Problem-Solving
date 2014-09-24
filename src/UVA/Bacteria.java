import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bacteria {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input = in.readLine();

		String[] inputs = input.split(" ");

		long k = Long.parseLong(inputs[0]);
		long b = Long.parseLong(inputs[1]);
		long n = Long.parseLong(inputs[2]);

		long t = Long.parseLong(inputs[3]);

		// long z = 1;
		// for (int i = 0; i < n; i++) {
		// z = k * z + b;
		// }
		//
		// System.out.println("z= " + z);
		//
		// long sec = 0;
		//
		// while (t < z) {
		// t = k * t + b;
		// sec++;
		// }

		long count = 1;
		while (count <= t) {
			count = count * k + b;
			--n;
		}

		System.out.println(Math.max(0, n + 1));

	}

}
