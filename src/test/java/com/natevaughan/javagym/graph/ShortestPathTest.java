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
}
