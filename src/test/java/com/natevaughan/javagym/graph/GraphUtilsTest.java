package com.natevaughan.javagym.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphUtilsTest {
	@Test
	public void testDepthFirst1() {
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
}
