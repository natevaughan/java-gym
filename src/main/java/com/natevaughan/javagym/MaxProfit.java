package com.natevaughan.javagym;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxProfit {
	public enum Direction {
		DROP,
		INCREASE,
		FLAT
	}

	private static class Trend {
		private final Direction direction;
		private final Integer startIdx;
		private final Integer startPrice;
		private Integer endIdx = null;
		private Integer endPrice = null;

		public Trend(Direction direction, int startIdx, int startPrice, int endIdx, int endPrice) {
			this.direction = direction;
			this.startIdx = startIdx;
			this.startPrice = startPrice;
			this.endIdx = endIdx;
			this.endPrice = endPrice;
		}

		public Direction getDirection() {
			return this.direction;
		};

		public Integer getStartIdx() {
			return this.startIdx;
		};

		public Integer getStartPrice() {
			return this.startPrice;
		};

		public void setEndIdx(Integer endIdx) {
			this.endIdx = endIdx;
		};

		public Integer getEndIdx() {
			return this.endIdx;
		};

		public void setEndPrice(Integer endPrice) {
			this.endPrice = endPrice;
		};

		public Integer getEndPrice() {
			return this.endPrice;
		};

		@Override
		public String toString() {
			return this.direction.toString() + ": " + (this.endPrice - this.startPrice);
		}
	}
	public static int calculateUsingClassAndDeque(int[] prices) {
		Deque<Trend> trends = new ArrayDeque<>();
		// every time there is a price drop break into a sublist
		// so drop with start and end index indicates sell
		// increase with start and end index indicates buy
		for (int i = 0; i < prices.length - 1; i++) {
			int current = prices[i];
			int next = prices[i + 1];
			Direction direction = next > current ? Direction.INCREASE : (next < current ? Direction.DROP : Direction.FLAT);
			Trend last = trends.peek();
			if (last != null && (Direction.FLAT == direction || direction == last.direction)) {
				last.setEndIdx(i + 1);
				last.setEndPrice(next);
			} else {
				trends.push(new Trend(direction, i, current, i + 1, next));
			}
		}
		return trends.stream()
				.filter(it -> Direction.INCREASE == it.direction)
				.reduce(0, (a, b) -> a + (b.getEndPrice() - b.getStartPrice()), (x, y) -> x + y);
	}
}
