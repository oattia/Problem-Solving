import java.util.Scanner;

public class CorrectMove {

	public static boolean legalQueen(int positionq, int positionk, int position) {

		if (position == positionq)
			return false;

		int xpositionq = positionq % 8 + 1;
		int ypositionq = positionq / 8 + 1;

		int xpositionk = positionk % 8 + 1;
		int ypositionk = positionk / 8 + 1;

		int xposition = position % 8 + 1;
		int yposition = position / 8 + 1;

		boolean b;

		if (xpositionk == xpositionq) {
			if (ypositionk > ypositionq) {

				if (((xpositionq == xposition) && (yposition < ypositionk))
						|| ypositionq == yposition) {
					b = true;
				} else {
					b = false;
				}

			} else {
				if (((xpositionq == xposition) && (yposition > ypositionk))
						|| ypositionq == yposition) {
					b = true;
				} else {
					b = false;

				}
			}

		} else if (ypositionk == ypositionq) {

			if (xpositionk > xpositionq) {

				if (((ypositionq == yposition) && (xposition < xpositionk))
						|| xpositionq == xposition) {
					b = true;
				} else {
					b = false;
				}

			} else {
				if (((ypositionq == yposition) && (xposition > xpositionk))
						|| xpositionq == xposition) {
					b = true;
				} else {
					b = false;
				}
			}

		} else if (xpositionq == xposition || ypositionq == yposition) {
			b = true;
		} else {
			b = false;
		}

		return b;

	}

	public static boolean legalKing(int positionk, int position) {

		boolean k;
		boolean v;
		boolean c;

		if ((position >= 0 && position < 64)) {
			k = true;
		} else {
			k = false;
		}

		if ((positionk - 7) % 8 == 0) {
			c = (position == positionk - 1 || position == positionk + 8 || position == positionk - 8);
		} else if (positionk % 8 == 0) {
			c = (position == positionk + 1 || position == positionk + 8 || position == positionk - 8);
		} else {
			c = (position == positionk + 1 || position == positionk - 1
					|| position == positionk + 8 || position == positionk - 8);
		}

		if (c) {
			v = true;
		} else {
			v = false;
		}

		if (k && v) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isLegalKing(int positionk, int position) {

		boolean j;

		int p1 = positionk + 1;
		int p2 = positionk - 1;
		int p3 = positionk + 8;
		int p4 = positionk - 8;

		boolean b1 = legalKing(positionk, p1);
		boolean b2 = legalKing(positionk, p2);
		boolean b3 = legalKing(positionk, p3);
		boolean b4 = legalKing(positionk, p4);

		boolean c1 = legalQueen(position, positionk, p1);
		boolean c2 = legalQueen(position, positionk, p2);
		boolean c3 = legalQueen(position, positionk, p3);
		boolean c4 = legalQueen(position, positionk, p4);

		if (b1 && !c1 || b2 && !c2 || b3 && !c3 || b4 && !c4) {
			j = true;
		} else {
			j = false;
		}

		return j;
	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {

			int positionk = input.nextInt();
			int positionq = input.nextInt();
			int newposition = input.nextInt();

			if (positionk == positionq) {
				System.out.println("Illegal state");
			} else if (!legalQueen(positionq, positionk, newposition)) {
				System.out.println("Illegal move");
			} else if ((legalQueen(positionq, positionk, newposition) && legalKing(
					positionk, newposition))) {
				System.out.println("Move not allowed");
			} else if (isLegalKing(positionk, newposition)) {
				System.out.println("Continue");

			} else {
				System.out.println("Stop");
			}

		}
	}
}
