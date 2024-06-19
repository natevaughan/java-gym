package com.natevaughan.javagym.bt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBTUtilsTest {
	private static final MyBTNode<String> NODE_A = new MyBTNode<>("A");
	private static final MyBTNode<String> NODE_B = new MyBTNode<>("B");
	private static final MyBTNode<String> NODE_C = new MyBTNode<>("C");
	private static final MyBTNode<String> NODE_D = new MyBTNode<>("D");
	private static final MyBTNode<String> NODE_E = new MyBTNode<>("E");
	private static final MyBTNode<String> NODE_F = new MyBTNode<>("F");

	@BeforeEach
	public void setupTree() {
		NODE_A.left = NODE_B;
		NODE_A.right = NODE_C;
		NODE_B.left = NODE_D;
		NODE_B.right = NODE_E;
		NODE_C.left = null;
		NODE_C.right = NODE_F;
		NODE_D.left = null;
		NODE_E.left = null;
		NODE_F.left = null;
	}

	@Test
	public void testTraverseDepthFirst1() {
		var result = MyBTUtils.traverseDepthFirst(NODE_A);
		assertEquals("A", result.getFirst());
		assertEquals("B", result.get(1));
		assertEquals("D", result.get(2));
		assertEquals("E", result.get(3));
		assertEquals("C", result.get(4));
		assertEquals("F", result.get(5));
	}

	@Test
	public void findMinValue() {
		var result = MyBTUtils.min(NODE_A);
		assertEquals("A", result);
	}
}
