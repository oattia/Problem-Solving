import java.util.Scanner;

public class R1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int count1 = 0, count0 = 0;
		int cout1 = 0, cout0 = 0;
		int n = in.nextInt();

		int t1 = 0, t2 = 0, t = 0;

		int[][] x = new int[n][2];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 2; j++) {

				x[i][j] = in.nextInt();

			}
		}

		for (int i = 0; i < n; i++) {
			if (x[i][0] == 1) {
				count1++;
			}

		}

		for (int i = 0; i < n; i++) {
			if (x[i][1] == 1) {
				cout1++;
			}

		}

		count0 = n - count1;
		cout0 = n - cout1;

		if (count1 >= count0) {
			t1 = count0;
		} else {
			t1 = count1;
		}

		if (cout1 >= cout0) {
			t2 = cout0;
		} else {
			t2 = cout1;
		}

		t = t1 + t2;
		System.out.println(t);
	}
}
