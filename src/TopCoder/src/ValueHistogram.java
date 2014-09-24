public class ValueHistogram {

	public static String[] build(int[] values) {

		String[] result = null;

		int[] counter = new int[10];

		for (int i = 0; i < values.length; i++) {

			counter[values[i]]++;
		}

		int counts = 0;

		for (int i = 0; i < counter.length; i++) {

			if (counter[i] > counts) {
				counts = counter[i];
			}

		}

		result = new String[counts + 1];

		result[0] = "..........";

		for (int i = result.length - 1; i >= 1; i--) {
			result[i] = "";
			for (int i1 = 0; i1 < counter.length; i1++) {
				if (counter[i1] > 0) {
					result[i] += "X";
					counter[i1]--;
				} else {
					result[i] += ".";
				}

			}
		}

		return result;
	}

}
