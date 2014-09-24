import java.io.*;
import java.util.Arrays;

public class BeautifulStrings22 {

	public static String count(String target, int[] repetes) {

		String back = "";
		int repetesCount = 0;
		int count = 0;

		for (int i = 0; i < target.length(); i++) {

			if (!isThere(back, target.charAt(i)))
				for (int j = i; j < target.length(); j++) {

					if (target.charAt(j) == target.charAt(i)
							&& target.charAt(j) >= 65 && target.charAt(j) <= 90) {
						repetesCount++;
						if (!isThere(back, target.charAt(i)))
							back += target.charAt(i);
					}

				}

			if (repetesCount != 0) {
				repetes[count] = repetesCount;
				count++;
				repetesCount = 0;
			}

		}

		return back;

	}

	private static boolean isThere(String back, char charAt) {

		for (int i = 0; i < back.length(); i++) {
			if (charAt == back.charAt(i))
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		long t1 = System.nanoTime();

		File v = new File(
				"C:\\Users\\Omar Yousry\\workspace\\Facebook\\src\\input.txt");

		BufferedReader reader = new BufferedReader(new FileReader(v));

		PrintWriter saver = new PrintWriter(
				"C:\\Users\\Omar Yousry\\workspace\\Facebook\\src\\output.txt");

		int num = Integer.parseInt(reader.readLine());

		for (int i = 0; i < num; i++) {

			String xx = reader.readLine();

			int[] cc = new int[26];
			count(xx.toUpperCase(), cc);

			int sum = 0;
			Arrays.sort(cc);
			for (int j = cc.length - 1; j >= 0 && cc[j] != 0; j--) {

				sum += cc[j] * (j + 1);

			}

			saver.println("Case #" + (i + 1) + ": " + sum);
		}

		saver.close();
		reader.close();

		long t2 = System.nanoTime();

		System.out.println(t2 - t1);

	}
}
