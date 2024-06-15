package com.natevaughan.javagym.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumPossibleTest {
	@Test
	public void simpleTest() {
		assertTrue(SumPossible.hasSum(4, new int[] {1, 2, 3}));
	}
	@Test
	public void simpleTest2() {
		assertFalse(SumPossible.hasSum(5, new int[] {2, 4}));
	}
	@Test
	public void simpleTest3() {
		assertFalse(SumPossible.hasSum(15, new int[] {4, 6, 10}));
	}
	@Test
	public void bigTest() {
		assertTrue(SumPossible.hasSum(41, new int[] {3, 4, 6, 8, 10, 13, 19, 30, 31, 36, 39, 40}));
	}
	@Test
	public void bigTest2() {
		var start = System.currentTimeMillis();
		assertFalse(SumPossible.hasSum(61, new int[] {2, 4, 6, 8, 10, 12, 14, 16, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38}));
		System.out.println("Ran in: " + (System.currentTimeMillis() - start));
	}
}
