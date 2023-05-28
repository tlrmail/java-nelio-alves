package com.udemy.java_completo_2023_poo.secao016.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sistema128 {

	public static void main(String[] args) {

		File file = new File("arquivos\\out.txt");
		Scanner input = null;
		try {
			input = new Scanner(file);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		}catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}finally {
			if(input != null) {
				input.close();
			}
		}

	}

}
