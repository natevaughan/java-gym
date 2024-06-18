package com.natevaughan.javagym.dp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Time complexity O(n)
 * Space complexity O(n)
 */
public class NonAdjacentSumTest {
	@Test
	public void nonAdjacentSum1() {
		List<Integer> nums = List.of(2, 4, 5, 12, 7);
		assertEquals(16, NonAdjacentSum.calculate(nums));
	}

	@Test
	public void nonAdjacentSum2() {
		List<Integer> nums = List.of(7, 5, 5, 12);
		assertEquals(19, NonAdjacentSum.calculate(nums));
	}

	@Test
	public void nonAdjacentSum3() {
		List<Integer> nums = List.of(7, 5, 5, 12, 17, 29);
		assertEquals(48, NonAdjacentSum.calculate(nums));
	}

	@Test
	public void nonAdjacentSum4() {
		List<Integer> nums = List.of(
				72, 62, 10,  6, 20, 19, 42,
				46, 24, 78, 30, 41, 75, 38,
				23, 28, 66, 55, 12, 17, 9,
				12, 3, 1, 19, 30, 50, 20
		);
		assertEquals(488, NonAdjacentSum.calculate(nums));
	}

	@Test
	public void nonAdjacentSum5() {
		List<Integer> nums = List.of(
				72, 62, 10,  6, 20, 19, 42, 46, 24, 78,
				30, 41, 75, 38, 23, 28, 66, 55, 12, 17,
				83, 80, 56, 68,  6, 22, 56, 96, 77, 98,
				61, 20,  0, 76, 53, 74,  8, 22, 92, 37,
				30, 41, 75, 38, 23, 28, 66, 55, 12, 17,
				72, 62, 10,  6, 20, 19, 42, 46, 24, 78,
				42
		);
		assertEquals(1465, NonAdjacentSum.calculate(nums));
	}
}
