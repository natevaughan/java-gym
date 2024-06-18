package com.natevaughan.javagym.dp;

import java.util.ArrayList;
import java.util.List;

public class FindCheapestPath {
	public static class Coords {
		int x;
		int y;

		public Coords(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static class Pair<T, U> {
		public T first;
		public U second;
		public Pair(T first, U second) {
			this.first = first;
			this.second = second;
		}
	}

	public static class Node<T> {
		T value;
		Node<T> next;

		public Node(T v) {
			this.value = v;
		}
	}

	public static List<Coords> calculate(List<List<Integer>> grid) {
		var result = calculate(0, 0, grid);
		if (result == null) {
			return null;
		}
		return toList(result.second);
	}

	private static Pair<Integer, Node<Coords>> calculate(int x, int y, List<List<Integer>> grid) {
		int width = grid.getFirst().size();
		int depth = grid.size();
		if (x == width || y == depth) {
			return null;
		}
		int currentValue = grid.get(y).get(x);
		var currentNode = new Pair<>(currentValue, new Node<>(new Coords(x, y)));
		if (x == width - 1 && y == depth - 1) {
			return currentNode;
		}
		var down = calculate(x, y + 1, grid);
		var right = calculate(x + 1, y, grid);
		if (down == null && right != null) {
			currentNode.first = currentValue + right.first;
			currentNode.second.next = right.second;
			return currentNode;
		} else if (right == null && down != null) {
			currentNode.first = currentValue + down.first;
			currentNode.second.next = down.second;
			return currentNode;
		} else if (down.first < right.first) {
			currentNode.first = currentValue + down.first;
			currentNode.second.next = down.second;
			return currentNode;
		} else {
			currentNode.first = currentValue + right.first;
			currentNode.second.next = right.second;
			return currentNode;
		}
	}

	private static <T> List<T> toList(Node<T> node) {
		return toList(node, new ArrayList<T>());
	}

	private static <T> List<T> toList(Node<T> current, List<T> list) {
		if (current == null) {
			return list;
		}
		list.add(current.value);
		return toList(current.next, list);

	}
}
