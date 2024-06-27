package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUncompressTest {
	@Test
	public void itShouldUncompressSimpleStrings() {
		assertEquals("foo", StringUncompressor.process("foo"));
	}

	@Test
	public void itShouldUncompressSingleDigits() {
		assertEquals("foofoo", StringUncompressor.process("2foo"));
	}

	@Test
	public void itShouldUncompressSingleDigits2() {
		assertEquals("foofoobarbarbar", StringUncompressor.process("2foo3bar"));
	}

	@Test
	public void itShouldUncompressMultiDigits() {
		assertEquals("ffffffffffffffffffffbbbyyyyyyyyyy", StringUncompressor.process("20f3b10y"));
	}

	@Test
	public void itShouldHandleEmptyStrings() {
		assertEquals("", StringUncompressor.process(""));
	}

}
