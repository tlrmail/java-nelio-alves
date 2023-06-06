package com.udemy.java_completo_2023_poo.secao018.interfaces.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities.Employee;

public class Sistema138 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		String path = "arquivos\\in2.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				lista.add(line);
				System.out.println(line);
				line = br.readLine();
			}
			
			Collections.sort(lista);
			System.out.println();
			for(String s: lista) {
				System.out.println(s);
			}
		}catch(IOException e) {
			System.out.println("Error: " + path);
		}

		metodo_comparable();
	}

	public static void metodo_comparable() {
		List<Employee> lista = new ArrayList<>();
		String path = "arquivos\\in3.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				lista.add(new Employee(fields[0], Double.valueOf(fields[1])));
				System.out.println(line);
				line = br.readLine();
			}
			
			Collections.sort(lista); // está ordenado pelo salário
			System.out.println();
			for(Employee employee: lista) {
				System.err.println(employee.toString());
			}
		}catch(IOException e) {
			System.out.println("Error: " + path);
		}

	}
}
