package com.natevaughan.javagym;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Staircase {
	public static List<String> create(Integer size) {
		return IntStream.rangeClosed(1, size)
				.mapToObj(i -> IntStream.rangeClosed(1, size)
						.mapToObj(j -> (j < size - i + 1) ? " " : "#")
						.collect(Collectors.joining()))
				.collect(Collectors.toList());
	}
}
