package com.natevaughan.javagym.dp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindCheapestPathTest {
	@Test
	public void itShouldReturnAListOf3() {
		var result = FindCheapestPath.calculate(List.of(
				List.of(2, 1),
				List.of(2, 1)
		));
		assertEquals(3, result.size());
	}

	@Test
	public void itShouldReturn00_10_11() {
		var result = FindCheapestPath.calculate(List.of(
				List.of(2, 1),
				List.of(2, 1)
		));
		assertEquals(0, result.get(0).x);
		assertEquals(0, result.get(0).y);

		assertEquals(1, result.get(1).x);
		assertEquals(0, result.get(1).y);

		assertEquals(1, result.get(2).x);
		assertEquals(1, result.get(2).y);
	}

	@Test
	public void itShouldHandleNegativeNumbers() {
		var result = FindCheapestPath.calculate(List.of(
				List.of(2, -5),
				List.of(2, 1)
		));
		assertEquals(0, result.get(0).x);
		assertEquals(0, result.get(0).y);

		assertEquals(1, result.get(1).x);
		assertEquals(0, result.get(1).y);

		assertEquals(1, result.get(2).x);
		assertEquals(1, result.get(2).y);
	}

	@Test
	public void itShouldWorkWith3By3() {
		var result = FindCheapestPath.calculate(List.of(
				List.of(2, -5, 6),
				List.of(2, 1, 0),
				List.of(-4, 11, 1)
		));
		assertEquals(5, result.size());
		assertEquals(0, result.get(0).x);
		assertEquals(0, result.get(0).y);

		assertEquals(1, result.get(1).x);
		assertEquals(0, result.get(1).y);

		assertEquals(1, result.get(2).x);
		assertEquals(1, result.get(2).y);

		assertEquals(2, result.get(3).x);
		assertEquals(1, result.get(3).y);

		assertEquals(2, result.get(4).x);
		assertEquals(2, result.get(4).y);
	}
}
