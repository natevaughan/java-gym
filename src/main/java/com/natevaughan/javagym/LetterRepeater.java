package com.natevaughan.javagym;

import java.util.stream.IntStream;

public class LetterRepeater {
	public static String generate(char letter) {
		var intVal = (int) letter;
		var count = 1;
		if (intVal > 96 && intVal < 123) {
			count = intVal - 96;
		} else if (intVal > 64 && intVal < 91) {
			count = intVal - 64;
		}
		return IntStream.rangeClosed(1, count)
				.mapToObj(i -> letter)
				.reduce("", (a, b) -> a + b, String::concat);
	}
}
