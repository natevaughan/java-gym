package com.natevaughan.javagym.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphUtils {
	public static <T> List<T> traverseDepthFirst(GraphNode<T> node) {
		if (node == null) {
			return null;
		}
		List<T> results = new ArrayList<>();
		results.add(node.val);
		for (GraphNode<T> edge : node.edges) {
			results.addAll(traverseDepthFirst(edge));
		}
		return results;
	}
}
