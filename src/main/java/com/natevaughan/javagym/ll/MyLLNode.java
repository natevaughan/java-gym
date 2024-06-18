package com.natevaughan.javagym.ll;

public class MyLLNode {
	private final String value;
	private MyLLNode next = null;
	public MyLLNode(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public MyLLNode setNext(MyLLNode next) {
		MyLLNode old = this.next;
		this.next = next;
		return old;
	}

	public MyLLNode next() {
		return this.next;
	}
}
