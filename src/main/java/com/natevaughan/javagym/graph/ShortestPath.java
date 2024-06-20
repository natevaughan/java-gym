package com.natevaughan.javagym.graph;

import java.util.*;

public class ShortestPath {

	public static class Pair<T, U> {
		public T left;
		public U right;
		public Pair(T left, U right) {
			this.left = left;
			this.right = right;
		}
	}

	public static int calculate(List<List<String>> graph, String source, String dest) {
		var a = buildAdjacencyMap(graph);
		var q = new ArrayDeque<Pair<String, Integer>>();
		q.add(new Pair<>(source, 0));
		while (!q.isEmpty()) {
			var current = q.remove();
			if (Objects.equals(current.left, dest)) {
				return current.right;
			}
			var neighbors = a.get(current.left);
			for (var n : neighbors) {
				q.add(new Pair<>(n, current.right  + 1));
			}
		}
		return Integer.MAX_VALUE;
	}

	public static Map<String, List<String>> buildAdjacencyMap(List<List<String>> connections) {
		var adjacency = new HashMap<String, List<String>>();
		for (var c : connections) {
			for (var node : c) {
				if (!adjacency.containsKey(node)) {
					adjacency.put(node, new ArrayList<>());
				}
			}
			adjacency.get(c.get(1)).add(c.get(0));
			adjacency.get(c.get(0)).add(c.get(1));
		}
		return adjacency;
	}
}
