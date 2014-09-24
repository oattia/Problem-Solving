import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division2 {

	public static String all = "0123456789";

	public static char[] workingComb;

	public static String[] storeCombs;
	public static int pos = 0;

	public static String[][][] storePairedPerms;

	public static void combs(int count, int index, int length, int finish) {

		if (count == length) {
			storeCombs[pos] = StringIt(workingComb);
			pos++;
			return;
		}
		if (index == finish) {
			return;
		}

		workingComb[count] = all.charAt(index);
		combs(count + 1, index + 1, length, finish);

		combs(count, index + 1, length, finish);

	}

	public static String StringIt(char[] comb2) {

		String t = "";
		for (int i = 0; i < comb2.length; i++) {
			t += comb2[i];
		}
		return t;
	}

	public static String[] perm(String string) {

		String[] perms = new String[120];
		int nowPos = 0;

		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				if (j == i)
					continue;
				for (int j2 = 0; j2 < string.length(); j2++) {
					if (j2 == j || j2 == i)
						continue;
					for (int k = 0; k < string.length(); k++) {
						if (k == j2 || k == j || k == i)
							continue;
						for (int k2 = 0; k2 < string.length(); k2++) {
							if (k2 == k || k2 == j2 || k2 == j || k2 == i)
								continue;

							String temp = "";

							temp += string.charAt(i);
							temp += string.charAt(j);
							temp += string.charAt(j2);
							temp += string.charAt(k);
							temp += string.charAt(k2);

							perms[nowPos] = temp;
							nowPos++;

						}
					}
				}
			}
		}
		return perms;
	}

	public static String normal(int i) {

		String ii = "" + i;

		if (ii.length() == 5) {
			return ii;
		} else if (ii.length() == 4) {

			String jj = "0";

			for (int j = 0; j < ii.length(); j++) {
				jj += ii.charAt(j);
			}

			return jj;
		}

		return null;
	}

	public static void main(String[] args) throws IOException {

		long t1 = System.nanoTime();

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		workingComb = new char[5];
		storeCombs = new String[252];

		combs(0, 0, 5, 10);

		storePairedPerms = new String[126][2][120];
		pos = 0;

		for (int i = 0; i < storeCombs.length / 2; i++) {

			String one[] = perm(storeCombs[i]);

			String two[] = perm(storeCombs[storeCombs.length - 1 - i]);

			storePairedPerms[i][0] = one;
			storePairedPerms[i][1] = two;
		}

		int k = 0;

		while (true) {

			String input = in.readLine();
			int n = Integer.parseInt(input);

			if (n == 0)
				break;
			else if (k != 0)
				System.out.println();

			int found = 0;

			for (int i = 0; i < 126; i++) {
				for (int j = 0; j < 120; j++) {

					int x = Integer.parseInt(storePairedPerms[i][0][j]);
					int nx = n * x;

					if (("" + nx).length() == 5) {
						for (int l = 0; l < 120; l++) {
							if (storePairedPerms[i][1][j].equals(("" + nx))) {
								System.out.println(storePairedPerms[i][1][j]
										+ " / " + storePairedPerms[i][0][j]);
								found++;
							}

						}
					} else if (("" + nx).length() == 4
							&& !("" + nx).contains("0")) {

					}
				}

			}

			if (found == 0)
				System.out.println("There are no solutions for " + n + ".");

			k++;
		}
		in.close();

		long t2 = System.nanoTime();

		System.out.println((t2 - t1) / Math.pow(10, 9));
	}
}
