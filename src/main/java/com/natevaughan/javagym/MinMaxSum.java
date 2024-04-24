package com.natevaughan.javagym;

import java.util.Arrays;

public class MinMaxSum {
	public static Long[] calculate(Integer[] numbers) {
		var max = Arrays.stream(numbers).max(Integer::compareTo).orElse(0);
		var min = Arrays.stream(numbers).min(Integer::compareTo).orElse(0);
		var sum = Arrays.stream(numbers).map(Long::valueOf).reduce(0L, Long::sum);
		return new Long[] {sum - max, sum - min};
	}
}
