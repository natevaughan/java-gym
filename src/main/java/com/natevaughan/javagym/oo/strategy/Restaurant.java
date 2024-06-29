package com.natevaughan.javagym.oo.strategy;

import java.text.DecimalFormat;
import java.util.*;

public class Restaurant {

	private static DecimalFormat df = new DecimalFormat("#.##");
	public static class MItem {
		String id;
		String name;
		Double price;
		public MItem(String id, String name, Double price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
	}

	public static class RTable {
		String id;
		Integer cap;
		Integer seated = 0;
		Map<String, Integer> orders = new HashMap<>();
		public RTable(String id, Integer cap) {
			this.id = id;
			this.cap = cap;
		}
	}

	public static class RTableCapComparator implements Comparator<RTable> {
		@Override
		public int compare(RTable a, RTable b) {
			return b.cap.compareTo(a.cap);
		}
	}

	/**
	 * State
	 */
	Map<String, MItem> items = new HashMap<>();
	Set<String> itemNames = new HashSet<>();
	Map<String, RTable> tables = new HashMap<>();

	public String process(String command) {
		var parts = parseCommand(command);
		var method = parts.get(0);
		if ("CREATE_ITEM".equals(method)) {
			return createItem(parts.get(1), parts.get(2), Double.parseDouble(parts.get(3)));
		} else if ("CREATE_TABLE".equals(method)) {
			return createTable(parts.get(1), Integer.parseInt(parts.get(2)));
		} else if ("SEAT_PARTY".equals(method)) {
			String tableId = null;
			if (parts.size() > 2) {
				tableId = parts.get(2);
			}
			return seatParty(Integer.parseInt(parts.get(1)), tableId);
		} else if ("ORDER_ITEM".equals(method)) {
			return orderItem(parts.get(1), parts.get(2));
		} else if ("CHECKOUT".equals(method)) {
			return checkout(parts.get(1));
		}
		return command;
	}

	private String checkout(String tableId) {
		if (!tables.containsKey(tableId)) {
			return "nonexistant";
		}
		RTable t = tables.get(tableId);
		Double total = 0.0;
		for (String itemId : t.orders.keySet()) {
			Integer count = t.orders.get(itemId);
			Double cost = items.get(itemId).price;
			total += count * cost;
		}
		Double factor = 1.08;
		if (t.cap >= 5) {
			factor = 1.23;
		}
		total = total * factor;
		return "$" + df.format(total);
	}

	private String orderItem(String itemId, String tableId) {
		if (!items.containsKey(itemId)) {
			return "nonexistant";
		}
		if (!tables.containsKey(tableId)) {
			return "nonexistant";
		}
		var t = tables.get(tableId);
		if (t.orders.containsKey(itemId)) {
			t.orders.put(itemId, t.orders.get(itemId) + 1);
		} else {
			t.orders.put(itemId, 1);
		}
		return "ordered";
	}

	private String seatParty(Integer size, String tableId) {
		RTable matched = null;
		if (tableId != null) {
			if (!tables.containsKey(tableId)) {
				return "nonexistant";
			}
			matched = tables.get(tableId);
		}
		if (matched == null) {
			List<RTable> sorted = new ArrayList<>(tables.values());
			sorted.sort(new RTableCapComparator());
			for (RTable t : sorted) {
				if (t.cap >= size && t.seated == 0) {
					matched = t;
				}
			}
		}
		if (matched == null) {
			return "";
		}
		if (matched.seated > 0) {
			return "occupied";
		}
		if (matched.cap < size) {
			return "insufficient";
		}
		matched.seated = size;
		return matched.id;
	}

	private String createTable(String tableId, Integer cap) {
		if (tables.containsKey(tableId)) {
			return "duplicate";
		}
		tables.put(tableId, new RTable(tableId, cap));
		return "created";
	}

	private String createItem(String itemId, String itemName, Double price) {
		if (items.containsKey(itemId)) {
			return "duplicate";
		}
		if (itemNames.contains(itemName)) {
			return "duplicate";
		}
		itemNames.add(itemName);
		items.put(itemId, new MItem(itemId, itemName, price));
		return "created";
	}

	private List<String> parseCommand(String c) {
		return List.of(c.split(" "));
	}
}
