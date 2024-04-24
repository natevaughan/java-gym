package com.natevaughan.javagym;

import java.util.Arrays;

public class MinMaxSum {
	public static Integer[] calculate(Integer[] numbers) {
		var max = Arrays.stream(numbers).max(Integer::compareTo).orElse(0);
		var min = Arrays.stream(numbers).min(Integer::compareTo).orElse(0);
		var sum = Arrays.stream(numbers).reduce(0, Integer::sum);
		return new Integer[] {sum - max, sum - min};
	}
}
