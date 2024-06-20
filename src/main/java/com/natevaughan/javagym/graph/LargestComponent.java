package com.natevaughan.javagym.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LargestComponent {
	public static int calculate(Map<Integer, List<Integer>> graph) {
		Set<Integer> visited = new HashSet<>();
		int max = 0;
		for (Integer key : graph.keySet()) {
			int size = traverse(graph, key, visited);
			if (size > max) {
				max = size;
			}
		}
		return max;
	}

	public static int traverse(Map<Integer, List<Integer>> graph, Integer src, Set<Integer> visited) {
		if (visited.contains(src)) {
			return 0;
		}
		visited.add(src);
		int sum = 1;
		for (Integer neighbor : graph.get(src)) {
			sum += traverse(graph, neighbor, visited);
		}
		return sum;
	}
}
