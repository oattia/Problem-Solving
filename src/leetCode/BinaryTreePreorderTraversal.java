package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	    public List<Integer> preorderTraversal(TreeNode root) {
	        if (root == null)
	            return new ArrayList<Integer>();
	        
	        ArrayList<Integer> toRet = new ArrayList<>();
	        
	        toRet.add(root.val);
	        toRet.addAll(preorderTraversal(root.left));
	        toRet.addAll(preorderTraversal(root.right));
	        
	        return toRet;
	    }
}
