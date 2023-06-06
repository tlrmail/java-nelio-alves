package com.udemy.java_completo_2023_poo.secao019.generics_set_map.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.exercicios.entities.UserLog;
import com.udemy.java_completo_2023_poo.secao019.generics_set_map.exercicios.entities.enums.Curso;

public class Sistema152_set {

	public static void main(String[] args) {
		
		
/** Alimentar dados no arquivo in6.txt		
		String path = "arquivos/in6.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for(int i = 0; i < 10; i++) {
				Curso curso; 
				String matricula = UUID.randomUUID().toString();
				for(int j = 1; j <= 3; j++) {
					Random random = new Random(10);
					if(j % 2 == 0) {
						curso = Curso.valueOf("A");
					}else if(j % 3 == 0) {
						curso = Curso.valueOf("B");
					}else{
						curso = Curso.valueOf("C");
					}
					if(curso != null) {
						UserLog userLog = new UserLog(matricula, curso);
						bw.write(userLog.toString());
						bw.newLine();
					}
				}
			}
			
		}catch(IOException e) {
			
		}

*/			
		
		
		Set<String> set = new TreeSet<>();
		List<UserLog> list = new ArrayList<>();

		String path = "arquivos/in6.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(", ");
				set.add(fields[0]);
				line = br.readLine();
			}
			
			System.out.println("Total de A: ");
			System.out.println("Total de B: ");
			System.out.println("Total de C: ");
			System.out.println("Total geral: " + set.size());
			
			for(String user: set) {
				System.out.println(user);
			}
			
		}catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}

		try(BufferedReader br = new BufferedReader(new FileReader(path))){

			int a = 0,b = 0,c = 0;
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(", ");
				UserLog user = new UserLog(fields[0], Curso.valueOf(fields[1]));
				list.add(user);
				line = br.readLine();
				if(user.getCurso().toString().equals("A")) {
					a++;
				}else if(user.getCurso().toString().equals("B")) {
					b++;
				}else {
					c++;
				}

			}
			int n = set.size();
			for(int i = 0; i < n ;i++) {
				
			}
			
			System.out.println();
			for(UserLog us: list) {
				System.out.println(us);
			}
			System.out.println("Total de A: " + a);
			System.out.println("Total de B: " + b);
			System.out.println("Total de C: " + c);
			System.out.println("Total geral: " + list.size());
			
			
			
		}catch(IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}
	}

}
