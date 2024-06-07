package com.natevaughan.javagym;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountingSort {
	public static List<Integer> countingSortA(List<Integer> arr) {
		var c = Stream.iterate(0, i -> 0)
				.limit(100)
				.toArray(s -> new Integer[s]);

		for (var i : arr) {
			c[i]++;
		}

		return Arrays.asList(c);
	}

	public static List<Integer> countingSortB(List<Integer> arr) {
		var c = Stream.iterate(0, i -> 0)
				.limit(100)
				.toArray(s -> new Integer[s]);

		for (var i : arr) {
			c[i]++;
		}

		return Arrays.asList(c);
	}
}
