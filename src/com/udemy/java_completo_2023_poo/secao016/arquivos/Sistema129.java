package com.udemy.java_completo_2023_poo.secao016.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sistema129 {

	public static void main(String[] args) {

		String path = "arquivos\\in.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}catch(IOException ioe) {
				System.out.println("Error: " + ioe.getMessage());
			}
			
		}

	}

}
