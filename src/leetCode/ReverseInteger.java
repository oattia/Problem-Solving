package leetcode;

public class ReverseInteger {

	public int reverse(int x) {
		if (x <= 9 && x >= -9)
			return x;

		boolean isNeg = x < 0;

		if (isNeg)
			x = -x;

		int y = 0;
		while (x > 0) {
			y *= 10;
			y += (x % 10);
			x /= 10;
		}

		if (isNeg)
			y = -y;

		return y;
	}
}
