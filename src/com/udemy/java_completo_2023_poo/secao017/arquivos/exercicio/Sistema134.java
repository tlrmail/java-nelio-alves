package com.udemy.java_completo_2023_poo.secao017.arquivos.exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema134 {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String path = "arquivos//sumary.csv";
		
		List<String> sumaryOut = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String fields = br.readLine();
			int count = 0;
			while(fields != null) {
				String [] strSplit = fields.split(",");
				Double total = Double.valueOf(strSplit[1]) * Double.valueOf(strSplit[2]);
				fields = br.readLine();
				sumaryOut.add(strSplit[0] + ", " + total);
			}
			
		}catch(IOException ioe ) {
			System.out.println("Error: " + ioe.getMessage());
		}
		
		String pathOut = "arquivos//out//sumaryOut.csv";
		boolean success = (new File("arquivos//out")).mkdir();

		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))){
			
			for(int i = 0; i < sumaryOut.size(); i++) {
				bw.write(sumaryOut.get(i).toString());
				bw.newLine();
			}
			
		}catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}
	}

}
