package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyMapKey {
	public Long id;
	public String name;

	public MyMapKey(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MyMapKey myMapKey = (MyMapKey) o;
		return Objects.equals(getId(), myMapKey.getId()) && Objects.equals(getName(), myMapKey.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName());
	}
}

class MyMapKeyComparator implements Comparator<MyMapKey> {

	@Override
	public int compare(MyMapKey o1, MyMapKey o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class HashCodeSetTest {
	private static final MyMapKey NATE = new MyMapKey(123L, "Nate");
	private static final Double NATE_BALANCE = 42.5;

	private static final MyMapKey NATE2 = new MyMapKey(123L, "Nate");
	private static final Double NATE_2_BALANCE = 1.0;

	@Test
	public void testMapOps() {

		var map = new LinkedHashMap<MyMapKey, Double>();
		map.put(NATE, NATE_BALANCE);
		map.put(NATE2, NATE_2_BALANCE);

		assertEquals(1, map.size());

	}

	@Test
	public void testSetOps() {
		var members = new TreeSet<>(new MyMapKeyComparator());
		members.add(NATE);
		members.add(NATE2);

		assertTrue(members.contains(NATE2));
		assertEquals(123L, members.first().getId());
	}
}

