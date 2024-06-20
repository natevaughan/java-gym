package com.natevaughan.javagym.graph;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestComponentTest {

	@Test
	public void largestComponentTest1() {
		var result = LargestComponent.calculate(Map.of(
				0, List.of(8, 1, 5),
				1, List.of(0),
				5, List.of(0, 8),
				8, List.of(0, 5),
				2, List.of(3, 4),
				3, List.of(2, 4),
				4, List.of(3, 2)
		));
		assertEquals(4, result);
	}

	@Test
	public void largestComponentTest2() {
		int result = LargestComponent.calculate(Map.of(
				1, List.of(2),
				2, List.of(1,8),
				6, List.of(7),
				9, List.of(8),
				7, List.of(6, 8),
				8, List.of(9, 7, 2)
		));
		assertEquals(6, result);
	}

	@Test
	public void largestComponentTest3() {
		int result = LargestComponent.calculate(Map.of(
				3, List.of(),
				4, List.of(6),
				6, List.of(4, 5, 7, 8),
				8, List.of(6),
				7, List.of(6),
				5, List.of(6),
				1, List.of(2),
				2, List.of(1)
		));
		assertEquals(5, result);
	}

	@Test
	public void largestComponentTest4() {
		int result = LargestComponent.calculate(Map.of());
		assertEquals(0, result);
	}

	@Test
	public void largestComponentTest5() {
		int result = LargestComponent.calculate(Map.of(
				0, List.of(4,7),
				1, List.of(),
				2, List.of(),
				3, List.of(6),
				4, List.of(0),
				6, List.of(3),
				7, List.of(0),
				8, List.of()
		));
		assertEquals(3, result);
	}
}
