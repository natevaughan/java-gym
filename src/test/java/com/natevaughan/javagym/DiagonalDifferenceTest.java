package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceTest {
	@Test
	public void diagonalDifferenceTestCase1() {
		var matrix = Arrays.asList(
				Arrays.asList(1, 2, 3),
				Arrays.asList(4, 5, 6),
				Arrays.asList(9, 8, 9)
		);
		var diff = DiagonalDifference.calculate(matrix);
		assertEquals(2, diff, "The difference of the first example should be 2");
	}

	@Test
	public void diagonalDifferenceTestCase2() {
		var matrix = Arrays.asList(
				Arrays.asList(11, 2, 4),
				Arrays.asList(4, 5, 6),
				Arrays.asList(10, 8, -12)
		);
		var diff = DiagonalDifference.calculate(matrix);
		assertEquals(15, diff, "The difference of the second example should be 15");
	}

	@Test
	public void diagonalDifferenceOneByOne() {
		var matrix = Arrays.asList(
				List.of(11)
				);
		var diff = DiagonalDifference.calculate(matrix);
		assertEquals(0, diff, "The difference of the one by one example should be 0");
	}
}
