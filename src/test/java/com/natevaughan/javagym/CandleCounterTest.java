package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandleCounterTest {
	@Test
	public void countOne() {
		var candles = List.of(1);
		var result = CandleCounter.count(candles);
		assertEquals(1, result);
	}

	@Test
	public void countSameNumber() {
		var candles = List.of(1, 1);
		var result = CandleCounter.count(candles);
		assertEquals(2, result);
	}

	@Test
	public void countThree5s() {
		var candles = List.of(1, 2, 3, 5, 3, 2, 5, 3, 5);
		var result = CandleCounter.count(candles);
		assertEquals(3, result);
	}

	@Test
	public void count1s() {
		var candles = List.of(8, 8, 8, 8, 8);
		var result = CandleCounter.count(candles);
		assertEquals(5, result);
	}

	@Test
	public void count0() {
		List<Integer> candles = List.of();
		var result = CandleCounter.count(candles);
		assertEquals(0, result);
	}
}
