import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ListOfConquests {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String test = in.readLine();

		int t = Integer.parseInt(test);

		String[] country = new String[t];

		for (int i = 0; i < t; i++) {
			country[i] = in.readLine().split(" ")[0];
		}

		Arrays.sort(country);

		int i = 0, start = 0;

		while (i < t) {

			for (i = start; i < t && country[start].equals(country[i]); i++)
				;
			int num = i - start;
			System.out.println(country[start] + " " + num);
			start = i;
		}
	}
}
