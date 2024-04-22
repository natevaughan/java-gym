package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {
	@Test
	void reverseStringTest() {
		var foo = "abc";
		var reversed = StringReverser.reverse(foo);
		assertEquals("cba", reversed, "It should reverse abc to cba");
	}
}
