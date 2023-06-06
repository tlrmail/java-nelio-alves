package com.udemy.java_completo_2023_poo.secao019.generics_set_map.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Sistema155_map {

	public static void main(String[] args) {

		String path = "arquivos\\in7.txt";
		Map<String, Integer> map = new TreeMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				
				String [] fields = line.split(",");
				String key = fields[0];
				Integer value = Integer.valueOf(fields[1]);
				if(map.size() == 0) {
					map.put(key, value);
				}else {
					if(map.containsKey(key)) {
						Integer soma = map.get(key) + value;
						map.put(key, soma);
					}else {
						map.put(key, value);
					}
				}
				
				line = br.readLine();
			}
		
			for(String key: map.keySet()) {
				System.out.println(key + ": "+ map.get(key));
			}
		}catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}

		
	}

}
