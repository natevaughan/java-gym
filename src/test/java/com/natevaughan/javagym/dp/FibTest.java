package com.natevaughan.javagym.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibTest {
	@Test
	public void baseCase0() {
		assertEquals(0, Fib.calculate(0));
	}
	@Test
	public void baseCase1() {
		assertEquals(1, Fib.calculate(1));
	}
	@Test
	public void case5() {
		assertEquals(5, Fib.calculate(5));
	}
	@Test
	public void baseCase6() {
		assertEquals(8, Fib.calculate(6));
	}

	@Test
	public void baseCase46() {
		var start = System.currentTimeMillis();
		assertEquals(1836311903, Fib.calculate(46));
		System.out.println("Ran in: " + (System.currentTimeMillis() - start));
	}
}
