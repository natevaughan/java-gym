package com.natevaughan.javagym.graph;

import java.util.ArrayList;
import java.util.Collection;

public class GraphNode<T> {
	public T val;
	public Collection<GraphNode<T>> edges = new ArrayList<>();
	public GraphNode(T val) {
		this.val = val;
	}
}
