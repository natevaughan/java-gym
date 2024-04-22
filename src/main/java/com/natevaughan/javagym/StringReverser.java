package com.natevaughan.javagym;

public class StringReverser {
	public static String reverse(String foo) {
		var sb = new StringBuilder();
		int[] chars = foo.chars().toArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			sb.append((char) chars[i]);
		}

		return sb.toString();
	}
}
