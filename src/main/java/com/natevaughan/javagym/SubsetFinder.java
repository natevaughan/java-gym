package com.natevaughan.javagym;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class SubsetFinder {
	public static Integer nonDivisible(Integer k, Set<Integer> intSet) {
		var sets = new HashMap<Integer, List<Set<Integer>>>();
		var intList = intSet.stream().toList();
		for (var i = 0; i < intList.size(); i++) {
			if (!sets.containsKey(intList.get(i))) {
				sets.put(intList.get(i), new ArrayList<>());
			}
			for (var j = i + 1; j < intList.size(); j++) {
				if ((intList.get(i) + intList.get(j)) % k != 0) {
					sets.get(intList.get(i)).add(Set.of(intList.get(i), intList.get(j)));
				}
			}
		}
		var matchedNumbers = sets.keySet().stream().filter(it -> !sets.get(it).isEmpty()).toList();
		var maxMutualMatch = 0;

		for (var number : matchedNumbers) {
			var setList = sets.get(number);
			var matched = setList.stream().filter(s -> s.contains(number)).toList();
			if (matched.size() > 0) {
				maxMutualMatch++;
			}
		}
		return maxMutualMatch;
	}
}
