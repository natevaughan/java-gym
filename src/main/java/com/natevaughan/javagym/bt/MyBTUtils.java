package com.natevaughan.javagym.bt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MyBTUtils {
	/**
	 * time complexity O(n)
	 * space complexity O(n)
	 */
	public static <T> List<T> traverse(MyBTNode<T> root) {
		Deque<MyBTNode<T>> stack = new ArrayDeque<>();
		List<T> list = new ArrayList<>();
		if (root != null) {
			stack.push(root);
		}
		while (!stack.isEmpty()) {
			MyBTNode<T> current = stack.pop();
			list.add(current.value);
			if (current.right != null) {
				stack.add(current.right);
			}
			if (current.left != null) {
				stack.add(current.left);
			}
		}
		return list;
	}
}
