import java.util.Scanner;
import java.util.Stack;

public class BalancedParantheses {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String test = in.nextLine();

		int t = Integer.parseInt(test);

		int i = 0;

		while (i < t) {

			String man = in.nextLine();

			Stack<Character> contain = new Stack<Character>();

			boolean b = true;

			for (int j = 0; j < man.length(); j++) {

				if (man.charAt(j) == '(' || man.charAt(j) == '[') {
					contain.push(man.charAt(j));
				} else if ((man.charAt(j) == ')' || man.charAt(j) == ']')
						&& contain.empty()) {
					System.out.println("No");
					b = false;
					break;
				} else if (man.charAt(j) == ')' && contain.peek() == '('
						|| man.charAt(j) == ']' && contain.peek() == '[') {
					contain.pop();
				} else {
					System.out.println("No");
					b = false;
					break;
				}

			}

			if (contain.empty() && b)
				System.out.println("Yes");
			else if (!contain.empty() && b)
				System.out.println("No");

			i++;
		}
		in.close();
	}

}
