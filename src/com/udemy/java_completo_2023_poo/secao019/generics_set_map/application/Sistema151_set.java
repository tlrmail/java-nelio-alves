package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.LogEntry;

public class Sistema151_set {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//String path = "arquivos/in5.txt";
		
		System.out.println("Enter file full path: ");
		String path = input.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<LogEntry> logEntries = new HashSet<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(" ");
				logEntries.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));
				line = br.readLine();
			}
			
			System.out.println("Total users: " + logEntries.size());
			
		}catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}
		
		input.close();
		
	}

}
