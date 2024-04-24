package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignCounterTest {

	static double PRECISION = 0.00000001;

	@Test
	public void testPositive() {
		var integers = new Integer[] {1, 2, 3, 4, 5};
		var result = SignCounter.calculate(integers);
		assertEquals(3, result.length);
		assertEquals(0.0D, result[1]);
		assertEquals(0.0D, result[2]);
		assertTrue(Math.abs(1.0D - result[0]) < PRECISION, String.format("The result should be less than %f from 1.0", PRECISION));
	}

	@Test
	public void testNegative() {
		var integers = new Integer[] {-1, -2, -3, -4, -5};
		var result = SignCounter.calculate(integers);
		assertEquals(3, result.length);
		assertEquals(0.0D, result[0]);
		assertEquals(0.0D, result[2]);
		assertTrue(Math.abs(1.0D - result[1]) < PRECISION, String.format("The result should be less than %f from 1.0", PRECISION));
	}

	@Test
	public void testMix() {
		var integers = new Integer[] {-2, -1, -0, 1, 2};
		var result = SignCounter.calculate(integers);
		assertEquals(3, result.length);
		assertTrue(Math.abs(0.4D - result[0]) < PRECISION, String.format("The result of positives should be less than %f from 0.4", PRECISION));
		assertTrue(Math.abs(0.4D - result[1]) < PRECISION, String.format("The result of negatives should be less than %f from 0.4", PRECISION));
		assertTrue(Math.abs(0.2D - result[1]) < PRECISION, String.format("The result of zeroes should be less than %f from 0.2", PRECISION));
	}
}
