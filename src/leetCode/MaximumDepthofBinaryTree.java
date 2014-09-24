package leetcode;

/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */

public class MaximumDepthofBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
	}

	public static void main(String[] args) {

	}

}
