package com.natevaughan.javagym;

import java.util.ArrayList;
import java.util.List;

public class StringCombiner {
	public static List<String> combinations(List<String> strings) {
		List<String> combinations = new ArrayList<>();
		for (var i = 0; i < strings.size(); i++) {
			for (var j = i + 1; j < strings.size(); j++) {
				combinations.add(strings.get(i) + strings.get(j));
			}
		}
		return combinations;
	}
}
