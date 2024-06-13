package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProfitTest {
	@Test
	public void maxProfitTest1() {
		int[] prices = new int[] {7,1,5,3,6,4};
		assertEquals(7, MaxProfit.calculateUsingClassAndDeque(prices));
	}

	@Test
	public void maxProfitTest2() {
		int[] prices = new int[] {1,2,3,4,5};
		assertEquals(4, MaxProfit.calculateUsingClassAndDeque(prices));
	}

	@Test
	public void maxProfitTest3() {
		int[] prices = new int[] {7,6,4,3,1};
		assertEquals(0, MaxProfit.calculateUsingClassAndDeque(prices));
	}
}
