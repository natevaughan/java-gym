package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterRepeaterTest {
	@Test
	public void letterRepeater_testLowercaseE() {
		var str = LetterRepeater.generate('e');
		assertEquals("eeeee", str);
	}

	@Test
	public void letterRepeater_testUppercaseE() {
		var str = LetterRepeater.generate('E');
		assertEquals("EEEEE", str);
	}

	@Test
	public void letterRepeater_testUppercaseZ() {
		var str = LetterRepeater.generate('Z');
		assertEquals("ZZZZZZZZZZZZZZZZZZZZZZZZZZ", str);
	}


	@Test
	public void letterRepeater_testLowercaseZ() {
		var str = LetterRepeater.generate('z');
		assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzzz", str);
	}

	@Test
	public void letterRepeater_testSpecialChar() {
		var str = LetterRepeater.generate('?');
		assertEquals("?", str);
	}

	@Test
	public void letterRepeater_testA() {
		var str = LetterRepeater.generate('A');
		assertEquals("A", str);
	}

	@Test
	public void letterRepeater_testa() {
		var str = LetterRepeater.generate('a');
		assertEquals("a", str);
	}
}
