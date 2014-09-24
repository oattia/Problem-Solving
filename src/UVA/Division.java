import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {

	public static boolean uniqueComb(String i, String j) {

		String ii = i + j;

		for (int j1 = 0; j1 < ii.length(); j1++) {
			for (int j2 = j1 + 1; j2 < ii.length(); j2++) {
				if (ii.charAt(j1) == ii.charAt(j2))
					return false;
			}
		}
		return true;
	}

	public static String normal(int i) {

		String ii = "" + i;

		if (ii.length() == 5)
			return ii;
		else if (ii.length() == 4)
			return ("0" + ii);
		else
			return null;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int k = 0;

		while (true) {

			int n = Integer.parseInt(in.readLine());

			if (n == 0)
				break;
			else if (k != 0)
				System.out.println();

			int countValids = 0;

			for (int i = 1234; i <= 97486; i++) {

				String ii = normal(i);
				String jj = normal(n * i);

				if (uniqueComb(ii, jj)) {
					countValids++;
					System.out.println(jj + " / " + ii + " = " + n);
				}

			}

			if (countValids == 0)
				System.out.println("There are no solutions for " + n + ".");

			k++;

		}
		in.close();
	}
}
