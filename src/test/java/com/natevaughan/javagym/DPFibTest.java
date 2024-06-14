package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DPFibTest {
	@Test
	public void baseCase0() {
		assertEquals(0, DPFib.calculate(0));
	}
	@Test
	public void baseCase1() {
		assertEquals(1, DPFib.calculate(1));
	}
	@Test
	public void case5() {
		assertEquals(5, DPFib.calculate(5));
	}
	@Test
	public void baseCase6() {
		assertEquals(8, DPFib.calculate(6));
	}

	@Test
	public void baseCase46() {
		var start = System.currentTimeMillis();
		assertEquals(1836311903, DPFib.calculate(46));
		System.out.println("Ran in: " + (System.currentTimeMillis() - start));
	}
}
