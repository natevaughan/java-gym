package com.natevaughan.javagym.ll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.natevaughan.javagym.ll.MyLLUtils.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyLLNodeTest {
	private static final MyLLNode NODE_A = new MyLLNode("A");
	private static final MyLLNode NODE_B = new MyLLNode("B");
	private static final MyLLNode NODE_C = new MyLLNode("C");
	private static final MyLLNode NODE_D = new MyLLNode("D");
	private static final MyLLNode NODE_Q = new MyLLNode("Q");

	@BeforeEach
	public void setupList() {
		NODE_A.setNext(NODE_B);
		NODE_B.setNext(NODE_C);
		NODE_C.setNext(NODE_D);
		NODE_D.setNext(null);
		NODE_Q.setNext(null);
	}

	@Test
	public void testPrintNodes() {
		printList(NODE_A);
	}

	@Test
	public void testGetAt1() {
		assertNull(getAt(NODE_A, 4));
	}

	@Test
	public void testGetAt2() {
		MyLLNode result = getAt(NODE_A, 3);
		assertNotNull(result);
		assertEquals("D", result.getValue());
	}

	@Test
	public void testReverse() {
		MyLLNode result = reverse(NODE_A);
		assertNotNull(result);
		printList(result);
		assertEquals("D", result.getValue());
		assertEquals("C", getAt(result, 1).getValue());
	}
}
