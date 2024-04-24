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
}
