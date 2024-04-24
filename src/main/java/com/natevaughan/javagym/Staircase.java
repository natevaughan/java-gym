package com.natevaughan.javagym;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Staircase {
	public static List<String> create(Integer size) {
		return IntStream.rangeClosed(1, size).mapToObj(i -> {
			return IntStream.rangeClosed(1, size).mapToObj(j -> {
				if (j < size - i + 1) {
					return " ";
				} else {
					return "#";
				}
			}).collect(Collectors.joining());
		}).collect(Collectors.toList());
	}
}
