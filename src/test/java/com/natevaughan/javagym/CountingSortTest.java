package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingSortTest {
	@Test
	public void countingSortATest1() {
		var result = CountingSort.countingSortA(List.of(1, 1, 1));
		assertEquals(100, result.size());
		assertEquals(3, result.get(1));
	}

	@Test
	public void countingSortBTest1() {
		var result = CountingSort.countingSortB(List.of(1, 1, 1));
		assertEquals(100, result.size());
		assertEquals(3, result.get(1));
	}
}
