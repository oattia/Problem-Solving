package leetcode;

import java.util.HashSet;

public class SingleNumber {

	public static int singleNumber(int[] A) {
		HashSet<Integer> dir = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (dir.contains(A[i]))
				dir.remove(A[i]);
			else
				dir.add(A[i]);
		}

		return (int) dir.toArray()[0];
	}

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] { 4 , 1, 1, 2, 2, 3 , 3}));
	}
}
