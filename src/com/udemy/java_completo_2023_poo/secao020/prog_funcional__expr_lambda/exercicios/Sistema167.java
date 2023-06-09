package com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.udemy.java_completo_2023_poo.secao020.prog_funcional__expr_lambda.exercicios.entities.Employee;

public class Sistema167 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		String path = "arquivos\\in9.txt";
		List<Employee> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				Employee employee = new Employee(fields[0], fields[1], Double.valueOf(fields[2]));
				list.add(employee);
				line = br.readLine();
			}

		} catch (IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}

		System.out.println("Enter value: ");
		Double value = input.nextDouble();

		List<String> nomesOrdenados = list.stream()
				.filter(p -> p.getSalary() > value)
				.map(p -> p.getEmail())
				.sorted()
				.collect(Collectors.toList());

		System.out.println("Email of people whose salary is more than $ " + String.format("%.2f", value) + ": ");
		for (String nome : nomesOrdenados) {
			System.out.println(nome);
		}
		
		Double sum = 
				list.stream()
				.filter(x -> x.getName().toUpperCase().startsWith("M"))
				.map(p -> p.getSalary())
				.reduce(0.0, (x,y) -> x + y);
		
		System.out.println("Sum of salary of people whose name starts with 'M': " + sum);
		
		input.close();
	}

}
