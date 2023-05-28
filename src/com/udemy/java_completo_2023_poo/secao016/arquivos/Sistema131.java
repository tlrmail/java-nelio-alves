package com.udemy.java_completo_2023_poo.secao016.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sistema131 {

	public static void main(String[] args) {
		
		String lines[] = {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "arquivos\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){ // com o true ele não recria o arquivo e coloca as strings no 
			for(String line : lines) {											// final
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}


	}

}
