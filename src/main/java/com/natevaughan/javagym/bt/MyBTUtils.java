package com.natevaughan.javagym.bt;

import com.natevaughan.javagym.dp.FindCheapestPath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MyBTUtils {
	/**
	 * time complexity O(n)
	 * space complexity O(n)
	 */
	public static <T> List<T> traverseDepthFirst(MyBTNode<T> root) {
		Deque<MyBTNode<T>> stack = new ArrayDeque<>();
		List<T> list = new ArrayList<>();
		if (root != null) {
			stack.push(root);
		}
		while (!stack.isEmpty()) {
			MyBTNode<T> current = stack.pop();
			list.add(current.value);
			if (current.right != null) {
				stack.push(current.right);
			}
			if (current.left != null) {
				stack.push(current.left);
			}
		}
		return list;
	}

	public static String min(MyBTNode<String> root) {
		if (root == null) {
			return null;
		}
		var stack = new ArrayDeque<MyBTNode<String>>();
		var min = root.value;
		stack.push(root);
		while (!stack.isEmpty()) {
			var current = stack.pop();
			if (min.compareTo(current.value) > 0) {
				min = current.value;
			}
			if (current.left != null) {
				stack.push(current.left);
			}
			if (current.right != null) {
				stack.push(current.right);
			}
		}
		return min;
	}
}
