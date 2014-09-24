import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class mineSweeper {

	static String arrin[], arrout[];
	static int n, m;

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int count = 1;

		while (true) {

			String numInput = in.readLine();
			n = Integer.parseInt(numInput.split(" ")[0]);
			m = Integer.parseInt(numInput.split(" ")[1]);

			if (n == 0 && m == 0)
				break;
			else if (count != 1)
				System.out.println();

			arrin = new String[n];

			for (int i = 0; i < arrin.length; i++)
				arrin[i] = in.readLine();

			arrout = new String[n];
			Arrays.fill(arrout, "");

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {

					if (arrin[i].charAt(j) == '*')
						arrout[i] += '*';
					else
						arrout[i] += getN(i, j);
				}
			}

			System.out.println("Field #" + count + ":");
			for (int i = 0; i < arrout.length; i++) {
				System.out.println(arrout[i]);

			}

			count++;
		}

	}

	public static int getN(int i, int j) {

		int neibours[][] = new int[8][2];

		// north
		neibours[0][0] = i - 1;
		neibours[0][1] = j;

		// south
		neibours[1][0] = i + 1;
		neibours[1][1] = j;

		// east
		neibours[2][0] = i;
		neibours[2][1] = j + 1;

		// west
		neibours[3][0] = i;
		neibours[3][1] = j - 1;

		// north-west
		neibours[4][0] = i - 1;
		neibours[4][1] = j - 1;

		// north-east
		neibours[5][0] = i - 1;
		neibours[5][1] = j + 1;

		// south-east
		neibours[6][0] = i + 1;
		neibours[6][1] = j - 1;

		// south-east
		neibours[7][0] = i + 1;
		neibours[7][1] = j + 1;

		int back = 0;

		for (int k = 0; k < 8; k++) {

			if (neibours[k][0] >= 0 && neibours[k][1] >= 0
					&& neibours[k][0] < n && neibours[k][1] < m) {

				if (arrin[neibours[k][0]].charAt(neibours[k][1]) == '*')
					back++;
			}

		}

		return back;
	}
}
