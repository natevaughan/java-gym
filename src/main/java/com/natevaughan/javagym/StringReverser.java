package com.natevaughan.javagym;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverser {
	public static String reverse(String fwd) {
		var chars = fwd.chars().toArray();
		var sb = new StringBuilder();
		for (int i = chars.length - 1; i >= 0; i--) {
			sb.append((char) chars[i]);
		}
		return sb.toString();
	}

	public static String[] reverseAll(String[] strings) {
		return Arrays.stream(strings).map(StringReverser::reverse).toArray(String[]::new);
	}
}
