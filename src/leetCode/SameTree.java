package leetcode;

/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */

public class SameTree {

	public boolean isSameTree2(TreeNode p, TreeNode q) {

		if (p == null && q == null)
			return true;
		else if (p != null && q != null)
			if (p.val != q.val)
				return false;
			else
				return isSameTree(p.left, q.left)
						&& isSameTree(p.right, q.right);
		else
			return false;
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null) {
			if (q == null)
				return true;
			else
				return false;
		}

		if (q == null)
			return false;

		if (p.val != q.val)
			return false;

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

}
