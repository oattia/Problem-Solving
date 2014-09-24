import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class jollo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String input = in.readLine();

			if (input.equals("0 0 0 0 0"))
				break;

			String[] inputs = input.split(" ");

			int girl[] = new int[3];
			int boy[] = new int[2];

			int[] girlTemp = new int[3];
			int[] boyTemp = new int[2];

			boolean[] flags = new boolean[3];

			for (int i = 0; i < girl.length; i++) {
				girl[i] = Integer.parseInt(inputs[i]);
				girlTemp[i] = girl[i];
			}
			for (int i = 0; i < boy.length; i++) {
				boy[i] = Integer.parseInt(inputs[i + 3]);
				boyTemp[i] = boy[i];
			}

			Arrays.sort(girl);
			Arrays.sort(boy);

			Arrays.sort(girlTemp);
			Arrays.sort(boyTemp);

			int win = 0;

			for (int i = 0; i < 2; i++) {

				win++;
			}

			if (win == 0) {
				System.out.println("-1");

			} else if (win == 1) {
				// has a chance to win if the the coming card was right
				System.out.println("2");

			} else if (win == 2) {
				// already a winner , get the minimum that doesn't exist
				System.out.println("3");

			}

		}

	}

}
