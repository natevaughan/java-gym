package com.natevaughan.javagym;

public class SignCounter {
	public static Double[] calculate(Integer[] integers) {
		var positiveCount = 0;
		var negativeCount = 0;
		var zeroCount = 0;
		for (var i : integers) {
			if (i < 0) {
				negativeCount++;
			} else if (i > 0) {
				positiveCount++;
			} else {
				zeroCount++;
			}
		}

		return new Double[] {(double) positiveCount / integers.length, (double) negativeCount / integers.length, (double) zeroCount /  integers.length};
	}
}
