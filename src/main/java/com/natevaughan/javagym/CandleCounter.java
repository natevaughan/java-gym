package com.natevaughan.javagym;

import java.util.List;

public class CandleCounter {
	public static Integer count(List<Integer> candles) {
//		return countUsingStreams(candles);
		return countUsingIteration(candles);
	}

	private static Integer countUsingIteration(List<Integer> candles) {
		if (candles.size() == 0) {
			return 0;
		}
		int count = 0;
		var max = candles.get(0);
		for (var i : candles) {
			if (i > max) {
				max = i;
				count = 1;
			} else if (i == max) {
				count++;
			}
		}
		return count;
	}

	private static Integer countUsingStreams(List<Integer> candles) {
		var result = candles.stream().reduce(new Integer[] {Integer.MIN_VALUE, 0}, (a, b) -> {
			if (b > a[0]) {
				return new Integer[] {b, 1};
			} else if (b == a[0]) {
				a[1]++;
				return a;
			} else {
				return a;
			}
		}, (a, b) -> {
			if (a[0] > b[0]) {
				return a;
			} else if (b[0] > a[0]) {
				return b;
			} else {
				a[1] += b[1];
				return a;
			}
		});
		return result[1];
	}
}
