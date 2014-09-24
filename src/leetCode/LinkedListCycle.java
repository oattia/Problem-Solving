package leetcode;

import java.util.HashSet;

public class LinkedListCycle {
	/**
	 * Definition for singly-linked list. class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; next = null; } }
	 */

	public boolean hasCycle(ListNode head) {
		HashSet<ListNode> dir = new HashSet<>();
		ListNode curr = head;
		while (curr != null) {
			if (dir.contains(curr))
				return true;
			dir.add(curr);
			curr = curr.next;
		}
		return false;
	}
}
