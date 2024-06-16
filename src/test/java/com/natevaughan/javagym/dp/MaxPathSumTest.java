package com.natevaughan.javagym.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxPathSumTest {
	@Test
	public void test1() {
		List<List<Integer>> grid = List.of(
				List.of(1, 3, 12),
				List.of(5, 1, 1),
				List.of(3, 6, 1)
		);
		Assertions.assertEquals(18, MaxPathSum.calculate(grid));
	}
	@Test
	public void test2() {
		List<List<Integer>> grid = List.of(
				List.of(1, 2, 8, 1),
				List.of(3, 1, 12, 10),
				List.of(4, 0, 6, 3)
		);
		assertEquals(36, MaxPathSum.calculate(grid));
	}
	@Test
	public void test3() {
		List<List<Integer>> grid = List.of(
				List.of(1, 2, 8, 1),
				List.of(3, 10, 12, 10),
				List.of(4, 0, 6, 3)
		);
		assertEquals(39, MaxPathSum.calculate(grid));

	}
	@Test
	public void test4() {
		List<List<Integer>> grid = List.of(
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
		);
		assertEquals(27, MaxPathSum.calculate(grid));
	}
	@Test
	public void test5() {
		List<List<Integer>> grid = List.of(
				List.of(1, 1, 3, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 2, 1, 1, 6, 1, 1, 5, 1, 1, 0, 0, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 5, 1, 1, 1, 1, 0, 1, 1, 1, 1),
				List.of(2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(2, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1),
				List.of(2, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 42, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
				List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
		);
		assertEquals(82, MaxPathSum.calculate(grid));
	}
}

