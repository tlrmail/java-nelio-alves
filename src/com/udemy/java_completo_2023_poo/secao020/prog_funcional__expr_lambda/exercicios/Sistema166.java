package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.exercicios.entities.Product;

public class Sistema166 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String path = "arquivos\\in8.txt";
		List<Product> products = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				products.add(new Product(fields[0],Double.valueOf(fields[1])));
				
				line = br.readLine();
			}
			
			Double average = products.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y)/products.size();
			System.out.println("Average price: " + String.format("%.4f", average));
			
			Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> menoresMedia = products
					.stream()
					.filter(p -> p.getPrice() < average)
					.map(p -> p.getName())
					.sorted(comparator.reversed())
					.collect(Collectors.toList())
					;
			
			System.out.println();
			System.out.println("Menores que a média: ");
			for(String m : menoresMedia) {
				System.err.println(m);
				
			}
			
			
		}catch(IOException ioe) {
			
		}

	}

}
