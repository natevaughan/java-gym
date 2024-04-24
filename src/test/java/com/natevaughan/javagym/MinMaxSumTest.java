package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxSumTest {
	@Test
	public void test1() {
		var numberStream = new Integer[] {1, 3, 5, 7, 9};
		var sums = MinMaxSum.calculate(numberStream);
		assertEquals(16, sums[0]);
		assertEquals(24, sums[1]);
	}
	@Test
	public void test2() {
		var numberStream = new Integer[] {1, 2, 3, 4, 5};
		var sums = MinMaxSum.calculate(numberStream);
		assertEquals(10L, sums[0]);
		assertEquals(14L, sums[1]);
	}
	@Test
	public void testBig() {
		var numberStream = new Integer[] {Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 3, Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 5};
		var sums = MinMaxSum.calculate(numberStream);
		assertEquals(Integer.MAX_VALUE * 4L - 14L, sums[0]);
		assertEquals(Integer.MAX_VALUE * 4L - 10L, sums[1]);
	}
}
