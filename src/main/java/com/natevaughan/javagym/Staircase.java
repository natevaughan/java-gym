package com.natevaughan.javagym;

import java.util.ArrayList;
import java.util.List;

public class Staircase {
	public static List<String> create(Integer size) {
		var rows = new ArrayList<String>();
		for (var i = 0; i < size; i++) {
			var sb = new StringBuilder();
			for (var j = 0; j < size; j++) {
				if (j < size - i - 1) {
					sb.append(" ");
				} else {
					sb.append("#");
				}
			}
			rows.add(sb.toString());
		}
		return rows;
	}
}
