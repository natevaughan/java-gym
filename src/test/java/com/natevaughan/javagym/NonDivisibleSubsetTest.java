package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonDivisibleSubsetTest {

	@Test
	void nonDivisibleSubset0() {
		var result = SubsetFinder.nonDivisible(4, Set.of(1, 2, 4, 6));
		assertEquals(3, result);
	}

	@Test
	void nonDivisibleSubset1() {
		var result = SubsetFinder.nonDivisible(4, Set.of(19, 12, 10, 24, 25, 22));
		assertEquals(3, result);
	}

	@Test
	void nonDivisibleSubset2() {
		var result = SubsetFinder.nonDivisible(4, Set.of(1, 7, 2, 4));
		assertEquals(3, result);
	}
}
