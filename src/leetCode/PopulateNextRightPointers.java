package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextRightPointers {

	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	private ArrayList<TreeLinkNode> BFS(TreeLinkNode root) {
		ArrayList<TreeLinkNode> res = new ArrayList<>();

		Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
		q.offer(root);

		while (!q.isEmpty()) {
			TreeLinkNode curr = q.poll();

			if (curr.left != null) {
				q.offer(curr.left);
			}

			if (curr.right != null) {
				q.offer(curr.right);
			}

			res.add(curr);
		}

		return res;
	}

	public void connect(TreeLinkNode root) {
		if (root == null)
			return;

		ArrayList<TreeLinkNode> bfs = BFS(root);

		int st = 0;
		int end = 0;

		while (st < bfs.size() && end < bfs.size()) {
			end = 2 * st;
			while (st < end) {
				bfs.get(st).next = bfs.get(++st);
			}

			bfs.get(st++).next = null;
		}

	}
}