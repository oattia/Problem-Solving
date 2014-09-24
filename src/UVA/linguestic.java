import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class linguestic {

	public static double[] p = { 12.53, 1.42, 4.68, 5.86, 13.68, 0.69, 1.01,
			0.70, 6.25, 0.44, 0.00, 4.97, 3.15, 6.71, 8.68, 2.51, 0.88, 6.87,
			7.98, 4.63, 3.93, 0.90, 0.02, 0.22, 0.90, 0.52 };

	public static String alpha = "abcdefghijklmnopqrstuvwxyz";
	public static String even = "aeiou";
	public static String odd = "bcdfghjklmnpqrstvwxyz";

	public static double sum, length, average;

	public static double[] averages = new double[7];

	public static double SBC(String w) {

		double sbc = 0.0;

		for (int i = 0; i < w.length(); i++) {

			sbc += (i + 1) * p[alpha.indexOf(w.charAt(i))];

		}

		return sbc;
	}

	public static void generate(int n) {

		if (n % 2 == 0)
			length = Math.pow(odd.length(), n / 2 - 1)
					* Math.pow(even.length(), n / 2);
		else
			length = Math.pow(odd.length(), n / 2)
					* Math.pow(even.length(), n / 2);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		Arrays.fill(averages, 0.0);

		int inputNum = Integer.parseInt(in.readLine());

		while (inputNum-- > 0) {

			String line = in.readLine();

			int n = line.length();

			if (averages[n - 1] == 0.0) {
				sum = length = average = 0.0;
				generate(n);
				average = sum / length;
				averages[n - 1] = average;
			}

			if (SBC(line) >= averages[n - 1])
				System.out.println("above or equal");
			else
				System.out.println("below");

		}
		in.close();
	}
}
