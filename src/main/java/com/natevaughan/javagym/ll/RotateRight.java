package com.natevaughan.javagym.ll;

public class RotateRight {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null || k == 0) {
			return head;
		}
		ListNode tail = reverse(head);
		head.next = tail;
		var i = 1;
		ListNode current = tail;
		while (i < k) {
			current = current.next;
			i++;
		}
		ListNode next = current.next;
		current.next = null;
		return reverse(next);
	}

	private static ListNode reverse(ListNode head) {
		ListNode previous = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
}
