import java.util.Scanner;

public class LanguageDetection {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 2000; i++) {

			String s = new String(input.nextLine());

			if (s.equals("#")) {
				break;
			} else if (s.equals("HELLO")) {
				System.out.println("Case " + i + ": ENGLISH");
			} else if (s.equals("HOLA")) {
				System.out.println("Case " + i + ": SPANISH");
			} else if (s.equals("HALLO")) {
				System.out.println("Case " + i + ": GERMAN");
			} else if (s.equals("BONJOUR")) {
				System.out.println("Case " + i + ": FRENCH");
			} else if (s.equals("CIAO")) {
				System.out.println("Case " + i + ": ITALIAN");
			} else if (s.equals("ZDRAVSTVUJTE")) {
				System.out.println("Case " + i + ": RUSSIAN");
			} else {
				System.out.println("Case " + i + ": UNKNOWN");
			}

		}
	}

}
