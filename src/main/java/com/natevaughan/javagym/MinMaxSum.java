package com.natevaughan.javagym;

import java.util.Arrays;

public class MinMaxSum {
	public static Long[] calculate(Integer[] numbers) {
		var max = Arrays.stream(numbers)
				.max(Integer::compareTo)
				.orElseThrow(IllegalArgumentException::new);
		var min = Arrays.stream(numbers)
				.min(Integer::compareTo)
				.orElseThrow(IllegalArgumentException::new);
		var sum = Arrays.stream(numbers)
				.map(Long::valueOf).reduce(Long::sum)
				.orElseThrow(IllegalArgumentException::new);
		return new Long[] {sum - max, sum - min};
	}
}
