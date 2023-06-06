package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.CalculationService;
import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.Product;

public class Sistema141 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		String path = "arquivos\\in3.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String fields[] = line.split(",");
				Product product = new Product(fields[0], Double.parseDouble(fields[1]));
				list.add(product);
				line = br.readLine();
			}
			
			Product max = CalculationService.max(list);
			System.out.println("Máximo: " + max);
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
