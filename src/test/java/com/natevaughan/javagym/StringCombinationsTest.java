package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringCombinationsTest {
	@Test
	public void stringCombinationsTest() {
		var result = StringCombiner.combinations(List.of("a", "b", "c"));
		assertTrue(result.contains("ab"));
		assertTrue(result.contains("ac"));
		assertTrue(result.contains("bc"));
		assertEquals(3, result.size());
	}

	@Test
	public void stringCombinationsTest2() {
		var result = StringCombiner.combinations(List.of("z", "q", "r", "s"));
		assertTrue(result.contains("zq"));
		assertTrue(result.contains("zr"));
		assertTrue(result.contains("zs"));
		assertTrue(result.contains("qr"));
		assertTrue(result.contains("qs"));
		assertTrue(result.contains("rs"));
		assertEquals(6, result.size());
	}
}
