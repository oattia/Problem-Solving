import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flag {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String nm = in.readLine();

		int n = Integer.parseInt(nm.split(" ")[0]);
		int m = Integer.parseInt(nm.split(" ")[1]);

		String inputs[] = new String[n];

		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = in.readLine();
		}

		boolean flag = true;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (inputs[i].charAt(0) != inputs[i].charAt(j))
					flag = false;

			}
		}

		for (int i = 0; i < n - 1; i++) {
			if (inputs[i].charAt(0) == inputs[i + 1].charAt(0))
				flag = false;
		}

		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
