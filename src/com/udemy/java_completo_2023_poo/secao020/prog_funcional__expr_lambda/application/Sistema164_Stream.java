package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sistema164_Stream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,4,2,5,24,57,13);

		Stream<Integer> stream = list.stream();
		
		System.out.println(Arrays.toString(stream.toArray()));
		
		Stream<Integer> stream2 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(stream2.toArray()));
		
		Stream<String> stream3 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(stream3.toArray()));
		
		Stream<Integer> stream4 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(stream4.limit(30).toArray()));
		
		Stream<Long> stream5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(stream5.limit(25).toArray()));
	}

}
