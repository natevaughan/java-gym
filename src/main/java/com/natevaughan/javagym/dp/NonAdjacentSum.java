package com.natevaughan.javagym.dp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonAdjacentSum {
	public static Integer calculate(List<Integer> nums) {
		Map<Integer, Integer> memo = new HashMap<>();
		return Math.max(fwdSum(0, nums, memo), fwdSum(1, nums, memo));
	}

	private static Integer fwdSum(int idx, List<Integer> nums, Map<Integer, Integer> memo) {
		if (idx >= nums.size()) {
			return 0;
		}
		if (memo.containsKey(idx)) {
			return memo.get(idx);
		}
		Integer result = nums.get(idx) + Math.max(fwdSum(idx + 2, nums, memo), fwdSum(idx + 3, nums, memo));
		memo.put(idx, result);
		return result;
	}
}
