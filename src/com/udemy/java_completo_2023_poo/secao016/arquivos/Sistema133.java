package com.udemy.java_completo_2023_poo.secao016.arquivos;

import java.io.File;
import java.util.Scanner;

public class Sistema133 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = scanner.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getAbsolutePath: " + path.getAbsolutePath());
		
		scanner.close();

	}

}
