package com.udemy.java_completo_2023_poo.secao017.arquivos;

import java.io.File;
import java.util.Scanner;

public class Sistema132 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = scanner.nextLine();
		
		File path = new File(strPath);
		
		//Pegar todas as pastas do diretório listado
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file: files) {
			System.err.println(file);
		}

		boolean success = (new File(strPath + "\\subdir")).mkdir();
		System.out.println("Directory created successfully: " + success);
		
		scanner.close();

	}

}
