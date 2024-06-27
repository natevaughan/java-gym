package com.natevaughan.javagym;

public class StringUncompressor {
	public static String process(String compressed) {
		int count = 1;
		StringBuilder uncompressed = new StringBuilder();
		StringBuilder substr = new StringBuilder();
		StringBuilder repeats = new StringBuilder();
		boolean parsingDigits = false;
		for (char c : compressed.toCharArray()) {
			if (Character.isDigit(c)) {
				if (!parsingDigits) {
					parsingDigits = true;
					if (!substr.isEmpty()) {
						if (!repeats.isEmpty()) {
							count = Integer.parseInt(repeats.toString());
						}
						uncompressed.append(substr.toString().repeat(count));
						substr = new StringBuilder();
						repeats = new StringBuilder();
					}
				}
				repeats.append(c);
			} else {
				parsingDigits = false;
				substr.append(c);
			}
		}
		if (!substr.isEmpty()) {
			if (!repeats.isEmpty()) {
				count = Integer.parseInt(repeats.toString());
			}
			uncompressed.append(substr.toString().repeat(count));
		}
		return uncompressed.toString();
	}
}
