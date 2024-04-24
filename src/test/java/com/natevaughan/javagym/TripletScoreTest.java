package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripletScoreTest {
	@Test
	void testBobWins() {
		var bob = Arrays.asList(1, 2, 3);
		var alice = Arrays.asList(0, 1, 2);

		var result = TripletScore.calculate(bob, alice);
		assertEquals(result.size(), 2);
		assertEquals(result.get(0), 3, "bob should have 3 points");
		assertEquals(result.get(1), 0, "alice should have 0 points");
	}

	@Test
	void testAliceWins() {
		var bob = Arrays.asList(1, 2, 3);
		var alice = Arrays.asList(2, 3, 1);

		var result = TripletScore.calculate(bob, alice);
		assertEquals(result.size(), 2);
		assertEquals(1, result.get(0), "bob should have 1 point");
		assertEquals(2, result.get(1), "alice should have 2 points");
	}

	@Test
	void testCase1() {
		var first =  Arrays.asList(5, 6, 7);
		var second =  Arrays.asList(3, 6, 10);
		var result = TripletScore.calculate(first, second);
		assertEquals(result.size(), 2);
		assertEquals(1, result.get(0), "first should have 1 point");
		assertEquals(1, result.get(1), "second should have 1 point");
	}

	@Test
	void testCase2() {
		var first =  Arrays.asList(17, 28, 30);
		var second =  Arrays.asList(99, 16, 8);
		var result = TripletScore.calculate(first, second);
		assertEquals(result.size(), 2);
		assertEquals(2, result.get(0), "first should have 2 points");
		assertEquals(1, result.get(1), "second should have 1 point");
	}

	@Test
	void testThrowsIllegalArgumentExceptionWhenLengthIsDifferent() {
		var bob = Arrays.asList(1, 2);
		var alice = Arrays.asList(0, 1, 2);
		TripletScore.calculate(bob, alice);
// todo
//		assertThrows(IllegalArgumentException.class, TripletScore.calculate(bob, alice));
	}
}
