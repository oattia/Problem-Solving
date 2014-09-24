public class OnTheFarmDivTwo {

	public static int[] animals(int heads, int legs) {

		double[] back = new double[2];

		double head = heads, leg = legs;

		back[0] = 2 * head - leg / 2;

		back[1] = (leg - 2 * head) / 2;

		int[] backs = new int[2];

		for (int i = 0; i < backs.length; i++) {
			backs[i] = (int) back[i];
		}

		if (2 * backs[0] + 4 * back[1] == legs && backs[0] + backs[1] == heads
				&& backs[0] >= 0 && backs[1] >= 0)
			return backs;
		else
			return null;

	}

}
