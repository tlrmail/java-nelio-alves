package com.udemy.java_completo_2023_poo.secao017.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sistema130 {

	public static void main(String[] args) {

		String path = "arquivos\\in.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}

	}

}
