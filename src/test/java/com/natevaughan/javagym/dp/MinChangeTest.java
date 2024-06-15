package com.natevaughan.javagym.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MinChangeTest {
	@Test
	public void test1() {
		assertEquals(1, MinChange.calculate(5, new int[] {1, 2, 3, 4, 5}));
	}
	@Test
	public void test2() {
		assertEquals(2, MinChange.calculate(5, new int[] {1, 2, 3, 4}));
	}
	@Test
	public void test3() {
		assertEquals(3, MinChange.calculate(9, new int[] {1, 2, 3, 5}));
	}
	@Test
	public void test600() {
		var start = System.currentTimeMillis();
		assertEquals(40, MinChange.calculate(600, new int[] {1, 2, 3, 5, 7, 8, 11, 12, 14, 15}));
		System.out.println("Ran in: " + (System.currentTimeMillis() - start));
	}
	@Test
	public void testNoChangePossible() {
		assertNull(MinChange.calculate(5, new int[] {4, 6}));
	}
}
