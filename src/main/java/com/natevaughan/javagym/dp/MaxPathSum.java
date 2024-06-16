package com.natevaughan.javagym.dp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxPathSum {
	public static Integer calculate(List<List<Integer>> grid) {
		return maxPathFrom(0, 0, grid, new HashMap<>());
	}

	public static Integer maxPathFrom(int x, int y, List<List<Integer>> grid, Map<List<Integer>, Integer> memo) {
		int lastRow = grid.size() - 1;
		int lastCol = grid.getFirst().size() - 1;
		if (x > lastCol || y > lastRow) {
			return 0;
		}
		List<Integer> key = List.of(x, y);
		if (memo.containsKey(key)) {
			return memo.get(key);
		}
		int current = grid.get(y).get(x);
		if (x == lastCol && y == lastRow) {
			memo.put(key, current);
			return current;
		}
		Integer result = current + Math.max(maxPathFrom(x + 1, y, grid, memo), maxPathFrom(x, y + 1, grid, memo));
		memo.put(key, result);
		return result;
	}
}
