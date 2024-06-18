package com.natevaughan.javagym.bt;

public class MyBTNode<T> {
	public T value;
	public MyBTNode<T> left;
	public MyBTNode<T> right;

	public MyBTNode(T value) {
		this.value = value;
	}
}
