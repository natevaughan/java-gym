package com.natevaughan.javagym;

import java.util.List;

public class BigSum {
	public static Long calculate(List<Integer> integers) {
		return integers.stream().map(Long::new).reduce(0L, Long::sum);
	}
}
