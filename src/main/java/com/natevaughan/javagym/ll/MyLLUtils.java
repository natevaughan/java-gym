package com.natevaughan.javagym.ll;

public class MyLLUtils {
	public static void printList(MyLLNode head) {
		printListRecursive(head);
	}

	public static MyLLNode getAt(MyLLNode head, Integer idx) {
		return getAtRecursive(head, idx);
	}

	public static MyLLNode reverse(MyLLNode head) {
		return reverseRecursive(head);
	}

	private static void printListIterative(MyLLNode head) {
		MyLLNode current = head;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.next();
		}
	}

	private static MyLLNode getAtIterative(MyLLNode head, Integer idx) {
		MyLLNode current = head;
		Integer currentIdx = 0;
		while (current != null) {
			if (currentIdx.equals(idx)) {
				return current;
			}
			currentIdx++;
			current = current.next();
		}
		return null;
	}

	private static MyLLNode reverseIterative(MyLLNode head) {
		MyLLNode previous = null;
		MyLLNode current = head;
		while (current != null) {
			MyLLNode next = current.next();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		return previous;
	}

	private static void printListRecursive(MyLLNode head) {
		System.out.println(head.getValue());
		if (head.next() != null) {
			printListRecursive(head.next());
		}
	}

	private static MyLLNode getAtRecursive(MyLLNode head, Integer idx) {
		return getAtRecursive(head, idx, 0);
	}

	private static MyLLNode getAtRecursive(MyLLNode current, Integer idx, Integer currentIdx) {
		if (current == null) {
			return current;
		}
		if (idx.equals(currentIdx)) {
			return current;
		}
		return getAtRecursive(current.next(), idx, currentIdx + 1);
	}

	private static MyLLNode reverseRecursive(MyLLNode head) {
		return reverseRecursive(null, head);
	}

	private static MyLLNode reverseRecursive(MyLLNode previous, MyLLNode current) {
		if (current == null) {
			return previous;
		}
		MyLLNode next = current.next();
		current.setNext(previous);
		return reverseRecursive(current, next);
	}
}
