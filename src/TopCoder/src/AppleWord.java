public class AppleWord {

	public static int minRep(String word) {

		if (word.length() < 5)
			return -1;

		if (word.length() == 5 && word.equalsIgnoreCase("apple"))
			return 0;
		else if (word.length() == 5 && !word.equalsIgnoreCase("apple"))
			return -1;

		String x = word.toLowerCase();

		int[] pos = new int[x.length()];
		int count = 0;

		for (int i = 0; i < x.length(); i++) {

			if (x.charAt(i) != 'a' || x.charAt(i) != 'p' || x.charAt(i) != 'l'
					|| x.charAt(i) != 'e') {
				pos[count] = i;
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "TopCoder" ;
		
		System.out.println(minRep(x.toLowerCase()));

	}

}
