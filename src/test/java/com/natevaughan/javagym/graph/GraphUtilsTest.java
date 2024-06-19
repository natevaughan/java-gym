package com.natevaughan.javagym.graph;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphUtilsTest {
	@Test
	public void testDepthFirstClassBasedTraversal() {
		GraphNode<String> hello = new GraphNode<>("hello");
		GraphNode<String> world = new GraphNode<>("world");
		GraphNode<String> i = new GraphNode<>("I");
		GraphNode<String> am = new GraphNode<>("am");
		GraphNode<String> nate = new GraphNode<>("Nate");
		hello.edges.add(world);
		world.edges.add(i);
		world.edges.add(am);
		hello.edges.add(nate);
		List<String> result = GraphUtils.traverseDepthFirst(hello);
		assertEquals("hello world I am Nate", String.join(" ", result));
	}

	@Test
	public void testDepthFirstAdjacencyMapTraversal() {
		Map<String, List<String>> adjacency = Map.of(
				"hello", List.of("Nate", "world"),
				"world", List.of("am", "I"),
				"I", List.of(),
				"am", List.of(),
				"Nate", List.of()
		);
		List<String> result = GraphUtils.traverseDepthFirst(adjacency, "hello");
		assertEquals("hello world I am Nate", String.join(" ", result));
	}

	@Test
	public void testBreadthFirstAdjacencyMapTraversal() {
		Map<String, List<String>> adjacency = Map.of(
				"hello", List.of("Nate", "world"),
				"world", List.of("I"),
				"I", List.of(),
				"am", List.of(),
				"Nate", List.of("am")
		);
		List<String> result = GraphUtils.traverseBreadthFirst(adjacency, "hello");
		assertEquals("hello Nate world am I", String.join(" ", result));
	}
}
