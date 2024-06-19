package com.natevaughan.javagym.graph;

import java.util.*;

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

	public static <T> List<T> traverseDepthFirst(Map<T, List<T>> adjacencyMap, T entry) {
		Deque<T> stack = new ArrayDeque<>();
		List<T> traversed = new ArrayList<>();
		stack.add(entry);
		while (!stack.isEmpty()) {
			T current = stack.pop();
			traversed.add(current);
			for (T neighbor : adjacencyMap.get(current)) {
				stack.push(neighbor);
			}
		}
		return traversed;
	}
}

