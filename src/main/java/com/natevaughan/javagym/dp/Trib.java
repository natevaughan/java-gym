package com.natevaughan.javagym.dp;

import java.util.HashMap;

public class Trib {
	public static int calculate(int n) {
		var memo = new HashMap<Integer, Integer>();
		memo.put(0, 0);
		memo.put(1, 0);
		memo.put(2, 1);
		return calculate(n, memo);
	}

	private static int calculate(int n, HashMap<Integer, Integer> memo) {
		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		var result = calculate(n - 1, memo) + calculate(n - 2, memo) + calculate(n - 3, memo);
		memo.put(n, result);
		return result;
	}
}
