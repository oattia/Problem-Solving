import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class BalancedSmileys {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		File v = new File(
				"C:\\Users\\Omar Yousry\\workspace\\Facebook\\src\\input.txt");

		BufferedReader reader = new BufferedReader(new FileReader(v));

		PrintWriter saver = new PrintWriter(
				"C:\\Users\\Omar Yousry\\workspace\\Facebook\\src\\output.txt");

		int num = Integer.parseInt(reader.readLine());

		for (int i = 0; i < num; i++) {

			String xx = reader.readLine();

			if (xx.length() == 0)
				saver.println("Case #" + (i + 1) + ": YES");
			else {

				boolean b = checkContent(xx);

				if (b) {

					boolean bb = checkPara(xx);

					if (bb)
						saver.println("Case #" + (i + 1) + ": YES");
					else
						saver.println("Case #" + (i + 1) + ": NO");

				} else
					saver.println("Case #" + (i + 1) + ": NO");
			}
		}

	}

	private static boolean checkPara(String xx) {

		int[] open = new int[xx.length()];
		int c1 = 0;

		int[] closed = new int[xx.length()];
		int c2 = 0;

		int[] colons = new int[xx.length()];
		int c3 = 0;

		for (int i = 0; i < xx.length(); i++) {

			char c = xx.charAt(i);

			if (c == '(') {
				open[c1] = i;
				c1++;
			} else if (c == ')') {
				closed[c2] = i;
				c2++;
			} else if (c == ':') {
				colons[c3] = i;
				c3++;
			}

		}

		if (c1 == c2) {

			for (int i = 0; i < c1; i++) {
				
			}

		}

		return false;
	}

	private static boolean checkContent(String xx) {

		for (int i = 0; i < xx.length(); i++) {

			if (outOfBound(xx.charAt(i))) {
				return false;
			}

		}

		return true;
	}

	private static boolean outOfBound(char charAt) {

		String xxx = "abcdefghijklmnopqrstuvwxyz :()";

		for (int i = 0; i < xxx.length(); i++) {

			if (charAt == xxx.charAt(i))
				return true;

		}

		return false;
	}
}
