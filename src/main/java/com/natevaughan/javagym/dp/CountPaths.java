package com.natevaughan.javagym.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountPaths {
	public static int sum(int xPos, int yPos, int rows, int columns, Map<Integer, Set<Integer>> walls) {
		return sum(xPos, yPos, rows, columns, walls, new HashMap<>());
	}

	private static int sum(int xPos, int yPos, int rows, int columns, Map<Integer, Set<Integer>> walls, Map<Integer, Map<Integer, Integer>> memo) {
		if (walls.containsKey(xPos) && walls.get(xPos).contains(yPos)) {
			return 0;
		}
		if (xPos == columns - 1 && yPos == rows - 1) {
			return 1;
		} else if (xPos > columns - 1 || yPos > rows - 1) {
			return 0;
		}
		if (memo.containsKey(xPos) && memo.get(xPos).containsKey(yPos)) {
			return memo.get(xPos).get(yPos);
		}

		int sum =  sum(xPos + 1, yPos, rows, columns, walls, memo) + sum(xPos, yPos + 1, rows, columns, walls, memo);
		if (!memo.containsKey(xPos)) {
			memo.put(xPos, new HashMap<>());
		}
		memo.get(xPos).put(yPos, sum);
		return sum;
	}
}
