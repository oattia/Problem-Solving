import java.io.*;
import java.util.Arrays;

public class BeautifulStrings {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		File v = new File(
				"C:\\Users\\Omar Yousry\\workspace\\Facebook\\src\\input.txt");

		BufferedReader reader = new BufferedReader(new FileReader(v));

		PrintWriter saver = new PrintWriter(
				"C:\\Users\\Omar Yousry\\workspace\\Facebook\\src\\output.txt");

		int num = Integer.parseInt(reader.readLine());

		for (int i = 0; i < num; i++) {

			String xx = reader.readLine().toUpperCase();

			int[] chars = new int[91];

			for (int j = 0; j < xx.length(); j++) {

				chars[xx.charAt(j)]++;
			}

			int[] lol = new int[26];

			System.arraycopy(chars, 65, lol, 0, 26);
			Arrays.sort(lol);

			int sum = 0;

			for (int j = lol.length - 1; j >= 0 && lol[j] != 0; j--) {

				sum += lol[j] * (j + 1);

			}

			saver.println("Case #" + (i + 1) + ": " + sum);
		}

		saver.close();
		reader.close();
	}
}
