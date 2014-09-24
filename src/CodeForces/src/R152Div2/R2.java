import java.util.*;

public class R2 {

	public static void getSecond(int maxpos1, int maxpos2, int[][] pref) {

		int first = 0;
		int second = 0;

		for (int i = 0; i < pref.length; i++) {
			for (int j = 1; j < pref[i].length; j++) {

				if (pref[i][j] == maxpos1) {
					first++;
					break;
				} else if (pref[i][j] == maxpos2) {
					second++;
					break;
				}
			}
		}

		if (first > second) {
			System.out.println(maxpos1 + " " + 2);
		} else {
			System.out.println(maxpos2 + " " + 2);
		}

	}

	public static void main(String[] args) {

		Scanner vv = new Scanner(System.in);

		int t = vv.nextInt();

		int i = 0;

		while (i < t) {

			long tt1 = System.nanoTime();

			int c = vv.nextInt();

			int v = vv.nextInt();

			int[] first = new int[c + 1];
			int[][] pref = new int[v][c];

			for (int j = 0; j < pref.length; j++) {
				for (int j2 = 0; j2 < pref[j].length; j2++) {

					pref[j][j2] = vv.nextInt();
				}
			}

			for (int j = 0; j < pref.length; j++) {

				first[pref[j][0]]++;
			}

			int max1 = first[1];
			int maxpos1 = 1;
			int maxpos2 = 1;

			for (int j = 2; j < first.length; j++) {

				if (first[j] >= max1) {
					maxpos2 = maxpos1;
					max1 = first[j];
					maxpos1 = j;
				}

			}

			if ((float) (((float) max1) / ((float) v)) > 0.5) {
				System.out.println(maxpos1 + " " + 1);
			} else {

				getSecond(maxpos1, maxpos2, pref);
			}

			long tt2 = System.nanoTime();

			System.out.println("time " + i + "= " + (tt2 - tt1));

			i++;

		}

	}
}
