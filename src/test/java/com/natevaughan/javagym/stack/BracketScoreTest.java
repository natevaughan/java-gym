package com.natevaughan.javagym.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// [] 1 if closed, *2 if enclosing
// {} 1 if closed, *3 if enclosing
// () 2 if closed, *4 if enclosing
public class BracketScoreTest {
	@Test
	public void bracketScoreTest1() {
		assertEquals(1, BracketScorer.score("[]"));
	}

	@Test
	public void bracketScoreTest2() {
		assertEquals(1, BracketScorer.score("{}"));
	}

	@Test
	public void bracketScoreTest3() {
		assertEquals(2, BracketScorer.score("()"));
	}
	@Test
	public void bracketScoreTest4() {
		assertEquals(2, BracketScorer.score("[]{}"));
	}

	@Test
	public void bracketScoreTest5() {
		assertEquals(3, BracketScorer.score("{}()"));
	}

	@Test
	public void bracketScoreTest6() {
		assertEquals(7, BracketScorer.score("()()()[]"));
	}

	@Test
	public void bracketScoreTest7() {
		assertEquals(2, BracketScorer.score("[[]]"));
	}

	@Test
	public void bracketScoreTest8() {
		assertEquals(3, BracketScorer.score("{[]}"));
	}

	@Test
	public void bracketScoreTest9() {
		assertEquals(12, BracketScorer.score("([][][])"));
	}
	@Test
	public void bracketScoreTest10() {
		assertEquals(15, BracketScorer.score("[()]{{}}([[]])"));
	}

	@Test
	public void bracketScoreTest11() {
		assertEquals(45, BracketScorer.score("[({}())][]([][]{[]})"));
	}
}
