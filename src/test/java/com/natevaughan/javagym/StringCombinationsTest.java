package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringCombinationsTest {
	@Test
	public void stringCombinationsTest() {
		var result = StringCombiner.combinations(List.of("a", "b", "c"));
		assertTrue(result.contains(Set.of("a", "b")));
		assertTrue(result.contains(Set.of("a", "c")));
		assertTrue(result.contains(Set.of("b", "c")));
		assertEquals(3, result.size());
	}

	@Test
	public void stringCombinationsTest2() {
		var result = StringCombiner.combinations(List.of("z", "q", "r", "s"));
		assertTrue(result.contains(Set.of("z", "q")));
		assertTrue(result.contains(Set.of("z", "r")));
		assertTrue(result.contains(Set.of("z", "s")));
		assertTrue(result.contains(Set.of("q", "r")));
		assertTrue(result.contains(Set.of("q", "s")));
		assertTrue(result.contains(Set.of("r", "s")));
		assertEquals(6, result.size());
	}
}
