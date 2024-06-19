package com.natevaughan.javagym.ll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RotateRightTest {
	private static final RotateRight.ListNode NODE_1 = new RotateRight.ListNode(1);
	private static final RotateRight.ListNode NODE_2 = new RotateRight.ListNode(2);
	private static final RotateRight.ListNode NODE_3 = new RotateRight.ListNode(3);
	private static final RotateRight.ListNode NODE_4 = new RotateRight.ListNode(4);
	private static final RotateRight.ListNode NODE_5 = new RotateRight.ListNode(5);

	@BeforeEach
	public void setupList() {
		NODE_1.next = NODE_2;
		NODE_2.next = NODE_3;
		NODE_3.next = NODE_4;
		NODE_4.next = NODE_5;
		NODE_5.next = null;
	}

	@Test
	public void rotateRightTest1() {
		var result = RotateRight.rotateRight(NODE_1, 2);
		assertEquals(4, result.val);
		assertEquals(5, result.next.val);
		assertEquals(1, result.next.next.val);
		assertEquals(2, result.next.next.next.val);
		assertEquals(3, result.next.next.next.next.val);
		assertNull(result.next.next.next.next.next);
	}
}
