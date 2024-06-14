package com.natevaughan.javagym.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TribTest {
	@Test
	public void baseCase0() {
		assertEquals(0, Trib.calculate(0));
	}
	@Test
	public void baseCase1() {
		assertEquals(0, Trib.calculate(1));
	}
	@Test
	public void case2() {
		assertEquals(1, Trib.calculate(2));
	}
	@Test
	public void baseCase3() {
		assertEquals(1, Trib.calculate(3));
	}

	@Test
	public void case14() {
		assertEquals(927, Trib.calculate(14));
	}

	@Test
	public void case21() {
		assertEquals(66012, Trib.calculate(21));
	}

	@Test
	public void case35() {
		var start = System.currentTimeMillis();
		assertEquals(334745777, Trib.calculate(35));
		System.out.println("Ran in: " + (System.currentTimeMillis() - start));
	}
}
