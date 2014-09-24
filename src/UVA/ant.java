import java.util.Scanner;

public class ant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t > 0) {

			// taking input for this case :

			int len = in.nextInt();
			int num = in.nextInt();

			int arr[] = new int[len];

			for (int i = 0; i < num; i++) {
				arr[in.nextInt() - 1] = 1;
			}

			// getting minimum :

			if (len % 2 == 0) {

				int firstPos;
				for (firstPos = (len - 1) / 2; firstPos >= 0
						&& arr[firstPos] == 0; firstPos--)
					;

				int lastPos;
				for (lastPos = (len - 1) / 2 + 1; lastPos < len
						&& arr[lastPos] == 0; lastPos++)
					;

				int min = Math.max(firstPos, len - lastPos);

				System.out.println(min - 1);

			} else {

				int firstPos;
				for (firstPos = len / 2; firstPos >= 0 && arr[firstPos] == 0; firstPos--)
					;

				int lastPos;
				for (lastPos = len / 2 + 1; lastPos < len && arr[lastPos] == 0; lastPos++)
					;

				int min = Math.max(firstPos, len - lastPos);

				System.out.println(min - 1);

			}

			// getting maximum :

			t--;
		}

		in.close();
	}
}
