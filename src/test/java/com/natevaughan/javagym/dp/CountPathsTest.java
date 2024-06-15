package com.natevaughan.javagym.dp;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPathsTest {
	@Test
	public void countPaths1() {
		int result = CountPaths.sum(0, 0, 2, 2, new HashMap<>());
		assertEquals(2, result);
	}

	@Test
	public void countPathsWithWall1() {
		var walls = new HashMap<Integer, Set<Integer>>();
		walls.put(1, Set.of(0));
		int result = CountPaths.sum(0, 0, 2, 2, walls);
		assertEquals(1, result);
	}

	@Test
	public void countPathsBigWithWalls1() {
		var walls = new HashMap<Integer, Set<Integer>>();
		walls.put(1, Set.of(0, 8, 11));
		walls.put(5, Set.of(1, 6, 7));
		walls.put(18, Set.of(8, 3));
		walls.put(3, Set.of(4, 9));
		int result = CountPaths.sum(0, 0, 12, 12, walls);
		assertEquals(120450, result);
	}
}
