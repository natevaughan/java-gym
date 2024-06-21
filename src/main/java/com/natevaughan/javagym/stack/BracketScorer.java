package com.natevaughan.javagym.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Set;

public class BracketScorer {
	public static int score(String s) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(0);
		Set<Character> openingBrackets = Set.of('[', '{', '(');
		Map<Character, Integer> addMap = Map.of(
				']', 1,
				'}', 1,
				')', 2
		);
		Map<Character, Integer> multMap = Map.of(
				']', 2,
				'}', 3,
				')', 4
		);
		for (Character c : s.toCharArray()) {
			if (openingBrackets.contains(c)) {
				stack.push(0);
			} else {
				Integer last = stack.pop();
				int penultimate = stack.pop();
				if (last == 0) {
					penultimate += addMap.get(c);
				} else {
					penultimate *= multMap.get(c);
				}
				stack.push(penultimate);
			}
		}
		return stack.pop();
	}
}
