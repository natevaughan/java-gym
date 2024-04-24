package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaircaseTest {
	@Test
	public void itShouldReturnASingleChar() {
		var output = Staircase.create(1);
		assertEquals(1, output.size());
		assertEquals("#", output.get(0));
	}

	@Test
	public void itShouldReturnASimpleStaircase() {
		var output = Staircase.create(2);
		assertEquals(2, output.size());
		assertEquals(" #", output.get(0));
		assertEquals("##", output.get(1));
	}

	@Test
	public void itShouldReturnASimpleStaircaseSize3() {
		var output = Staircase.create(3);
		assertEquals(3, output.size());
		assertEquals("  #", output.get(0));
		assertEquals(" ##", output.get(1));
		assertEquals("###", output.get(2));
	}
}
