public class Combs {

	public static String all = "0123456789";
	
	public static char[] comb;
	
	public static void combs(int count, int index, int length, int finish) {

		if (count == length) {
			System.out.println(StringIt(comb));
			return;
		}
		if (index == finish) {
			return;
		}

		comb[count] = all.charAt(index);
		combs(count + 1, index + 1, length, finish);

		combs(count, index + 1, length, finish);

	}

	private static String StringIt(char[] comb2) {
		String t = "";
		for (int i = 0; i < comb2.length; i++) {
			t += comb2[i];
		}
		return t;
	}

	public static void main(String[] args) {

		int size = 10;
		comb = new char[size];

		combs(0, 0, size, all.length());

	}

}
