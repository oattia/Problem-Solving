import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buttons {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input = in.readLine();

		int n = Integer.parseInt(input);

		int count = n;

		for (int i = 1; i < n; i++) {

			count += n - i;

			count += i * (n - i - 1);
		}

		System.out.println(count);

	}

}
