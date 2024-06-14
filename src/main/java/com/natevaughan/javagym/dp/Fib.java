package com.natevaughan.javagym.dp;

import java.util.HashMap;

public class Fib {
	public static int calculate(int n) {
		var memo = new HashMap<Integer, Integer>();
		memo.put(0, 0);
		memo.put(1, 1);
		return calculateMemo(n, memo);
	}

	private static int calculateMemo(int n, HashMap<Integer, Integer> memo) {
		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		var result = calculateMemo(n - 1, memo) + calculateMemo(n - 2, memo);
		memo.put(n, result);
		return result;
	}
}
