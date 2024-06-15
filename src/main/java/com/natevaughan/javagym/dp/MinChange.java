package com.natevaughan.javagym.dp;

import java.util.HashMap;

public class MinChange {
	public static Integer calculate(int amount, int[] possibilities) {
		return calculate(amount, possibilities, new HashMap<>());
	}

	public static Integer calculate(int amount, int[] possibilities, HashMap<Integer, Integer> memo) {
		if (amount == 0) {
			return 0;
		}
		if (memo.containsKey(amount)) {
			return memo.get(amount);
		}
		Integer minDepth = null;
		for (int possibility : possibilities) {
			var remaining = amount - possibility;
			if (remaining >= 0) {
				var depth = calculate(remaining, possibilities, memo);
				if (depth != null) {
					if (minDepth == null || depth < minDepth) {
						minDepth = depth;
					}
				}
			}
		}
		if (minDepth != null) {
			memo.put(amount, minDepth + 1);
			return minDepth + 1;
		}
		memo.put(amount, null);
		return minDepth;
	}
}
