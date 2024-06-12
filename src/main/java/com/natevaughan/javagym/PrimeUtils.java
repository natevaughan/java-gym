package com.natevaughan.javagym;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimeUtils {
	private static final List<Integer> COMMON_PRIMES = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 );

	public static Integer firstPrimeFactor(Integer i) {
		for (Integer p : COMMON_PRIMES) {
			if (i % p == 0) {
				return p;
			}
		}
		for (int j = 101; j < Integer.MAX_VALUE; j++) {
			if (i % j == 0) {
				return j;
			}
		}
		throw new RuntimeException("No Integer prime found!");
	}

	public static Map<Integer, Integer> recursivelyFindPrimeFactors(Integer i) {
		return recursivelyFindPrimeFactors(i, new HashMap<>());
	}

	private static Map<Integer, Integer> recursivelyFindPrimeFactors(Integer i, Map<Integer, Integer> factorsSoFar) {
		var next = firstPrimeFactor(i);
		if (factorsSoFar.containsKey(next)) {
			factorsSoFar.put(next, factorsSoFar.get(next) + 1);
		} else {
			factorsSoFar.put(next, 1);
		}
		if (i / next == 1) {
			return factorsSoFar;
		} else {
			return recursivelyFindPrimeFactors(i / next, factorsSoFar);
		}
	}
}
