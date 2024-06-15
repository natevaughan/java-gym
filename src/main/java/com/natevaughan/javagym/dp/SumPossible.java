package com.natevaughan.javagym.dp;

import java.util.HashMap;

public class SumPossible {
	public static boolean hasSum(int sum, int[] possibilities) {
		var memo = new HashMap<Integer, Boolean>();
		memo.put(0, true);
		return hasSum(sum, possibilities, memo);
	}

	private static boolean hasSum(int sum, int[] possibilities, HashMap<Integer, Boolean> memo) {
		if (memo.containsKey(sum)) {
			 return memo.get(sum);
		}
		for (var v : possibilities) {
			if (sum - v >= 0) {
				if (hasSum(sum - v, possibilities, memo)) {
					return true;
				}
			}
		}
		memo.put(sum, false);
		return false;
	}
}
