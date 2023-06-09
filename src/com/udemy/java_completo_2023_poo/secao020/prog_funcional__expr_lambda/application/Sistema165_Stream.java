package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sistema165_Stream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 2, 5, 24, 57, 13);

		Stream<Integer> stream01 = list.stream().map(x -> x * 111);
		System.out.println(Arrays.asList(stream01.toArray()));

		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum: " + sum);
		
		List<Integer> list02 = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 111)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(list02.toArray()));
		
	}
}
