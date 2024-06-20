package com.natevaughan.javagym.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathTest {
	@Test
	public void test1() {
		var graph = List.of(
				List.of("Albuqurque", "Phoenix"),
				List.of("Phoenix", "Tucumcari"),
				List.of("Albuqurque", "Tucumcari"),
				List.of("San Diego", "Phoenix"),
				List.of("San Diego", "San Antonio"),
				List.of("San Antonio", "Las Vegas"),
				List.of("Tucumcari", "Reno"),
				List.of("Las Vegas", "Reno"),
				List.of("San Antonio", "Reno")
		);
		assertEquals(3, ShortestPath.calculate(graph, "Albuqurque", "Las Vegas"));
	}

	@Test
	public void test2() {
		List<List<String>> edges = List.of(
				List.of("w", "x"),
				List.of("x", "y"),
				List.of("z", "y"),
				List.of("z", "v"),
				List.of("w", "v")
		);

		assertEquals(2, ShortestPath.calculate(edges, "w", "z"));
	}

	@Test
	public void test3() {
		List<List<String>> edges = List.of(
				List.of("w", "x"),
				List.of("x", "y"),
				List.of("z", "y"),
				List.of("z", "v"),
				List.of("w", "v")
		);

		assertEquals(1, ShortestPath.calculate(edges, "y", "x"));
	}

	@Test
	public void test4() {
		List<List<String>> edges = List.of(
				List.of("a", "c"),
				List.of("a", "b"),
				List.of("c", "b"),
				List.of("c", "d"),
				List.of("b", "d"),
				List.of("e", "d"),
				List.of("g", "f")
		);

		assertEquals(3, ShortestPath.calculate(edges, "a", "e"));
	}

	@Test
	public void test5() {
		List<List<String>> edges = List.of(
				List.of("a", "c"),
				List.of("a", "b"),
				List.of("c", "b"),
				List.of("c", "d"),
				List.of("b", "d"),
				List.of("e", "d"),
				List.of("g", "f")
		);

		assertEquals(2, ShortestPath.calculate(edges, "e", "c"));
	}

	@Test
	public void test6() {
		List<List<String>> edges = List.of(
				List.of("m", "n"),
				List.of("n", "o"),
				List.of("o", "p"),
				List.of("p", "q"),
				List.of("t", "o"),
				List.of("r", "q"),
				List.of("r", "s")
		);

		assertEquals(6, ShortestPath.calculate(edges, "m", "s"));
	}
}
