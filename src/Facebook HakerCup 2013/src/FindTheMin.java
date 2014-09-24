import java.io.*;
import java.util.ArrayList;

public class FindTheMin {

	public static boolean hasKey(int[] m, int count) {

		for (int j = 0; j < m.length - 1; j++) {

			if (m[j] == count)
				return true;
		}

		return false;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		File v = new File(
				"C:\\Users\\Omar Yousry\\workspace\\Facebook\\src\\input.txt");

		BufferedReader reader = new BufferedReader(new FileReader(v));

		PrintWriter saver = new PrintWriter(
				"C:\\Users\\Omar Yousry\\workspace\\Facebook\\src\\output.txt");

		int num = Integer.parseInt(reader.readLine());

		for (int i = 0; i < num; i++) {

			String[] NnK = reader.readLine().split(" ");
			int n = Integer.parseInt(NnK[0]);
			int k = Integer.parseInt(NnK[1]);

			String[] abcr = reader.readLine().split(" ");
			int a = Integer.parseInt(abcr[0]);
			int b = Integer.parseInt(abcr[1]);
			int c = Integer.parseInt(abcr[2]);
			int r = Integer.parseInt(abcr[3]);

			int[] m = new int[k + 1];

			m[0] = a;

			for (int j = 1; j < k; j++) {
				m[j] = (b * m[j - 1] + c) % r;
			}

			int count = 0;

			int bbb = n - k;

			int v1 = 0;

			while (bbb > 0) {

				if (!hasKey(m, count)) {
					m[v1] = count;

					count = 0;

					if (v1 == k)
						v1 = 0;
					else
						v1++;

					bbb--;
				}

				count++;
			}

			saver.println("Case #" + (i + 1) + ": " + m[k]);

		}

		saver.close();
		reader.close();
	}

}
