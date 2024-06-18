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
	public void testTraverse() {
		var result = MyBTUtils.traverse(NODE_A);
		assertEquals("A", result.getFirst());
	}
}
