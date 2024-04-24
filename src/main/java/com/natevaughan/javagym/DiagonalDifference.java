package com.natevaughan.javagym;

import java.util.List;

public class DiagonalDifference {
	public static Integer calculate(List<List<Integer>> matrix) {
		if (matrix == null) {
			 throw new NullPointerException("null list passed to DiagonalDifference.calculate");
		}
		var fwdSum = 0;
		var revSum = 0;
		var len = matrix.size();
		for (int i = 0; i < len; i++) {
			var row = matrix.get(i);
			if (row == null) {
				throw new NullPointerException("null inner list passed to DiagonalDifference.calculate");
			}
			if (row.size() != len) {
				throw new IllegalArgumentException("Matrix is not square at row " + i);
			}
			fwdSum += row.get(i);
			revSum += row.get(len - i - 1);
		}
		return Math.abs(fwdSum - revSum);
	}
}
