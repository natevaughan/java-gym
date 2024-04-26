package com.natevaughan.javagym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StringCombiner {
	public static List<Set<String>> combinations(List<String> strings) {
		List<Set<String>> combinations = new ArrayList<>();
		for (var i = 0; i < strings.size(); i++) {
			for (var j = i + 1; j < strings.size(); j++) {
				combinations.add(Set.of(strings.get(i), strings.get(j)));
			}
		}
		return combinations;
	}
}
