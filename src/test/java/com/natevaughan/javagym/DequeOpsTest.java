package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DequeOpsTest {
	@Test
	public void test1() {
		var d = new ArrayDeque<Integer>();
		d.push(1);
		d.push(2);
		assertEquals(2, d.peek());
	}
}
