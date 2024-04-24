package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigSumTest {
	@Test
	void BigSumTest1() {
		var list = Arrays.asList(1000000001, 1000000002, 1000000003, 1000000004, 1000000005);
		var sum = BigSum.calculate(list);
		assertEquals(5000000015L, sum, "It should sum to a Long");
	}
}
