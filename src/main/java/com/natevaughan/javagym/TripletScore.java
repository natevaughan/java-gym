package com.natevaughan.javagym;

import java.util.Arrays;
import java.util.List;

public class TripletScore {
	public static List<Integer> calculate(List<Integer> a, List<Integer> b) {
		var aScore = 0;
		var bScore = 0;
		if (a.size() != b.size()) {
			throw new IllegalArgumentException("lists must be the same length");
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				aScore++;
			} else if (a.get(i) < b.get(i)) {
				bScore++;
			}
		}
		return Arrays.asList(aScore, bScore);
	}
}
