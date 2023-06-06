package com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list == null) {
			throw new IllegalStateException("List can't be empty");
		}

		T max = list.get(0);

		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}

		return max;

	}
}
