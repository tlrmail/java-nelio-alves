package com.udemy.java_completo_2023_poo.secao005.exercicios;

import java.util.Scanner;

public class SistemaExercicio54 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int horaInicial, horaFinal, horaIntervalo;
		System.out.println("Digite a hora inicial e final: ");
		horaInicial = input.nextInt();
		horaFinal = input.nextInt();
		
		if(horaInicial > horaFinal) {
			horaIntervalo = (horaFinal + 24) - horaInicial;
			System.out.println("");
		}else if(horaInicial < horaFinal){
			horaIntervalo = horaFinal - horaInicial; 
		}else {
			horaIntervalo = 24;
		}

		System.out.println("O JOGO DUROU "+horaIntervalo+" HORA(S)");
		
		input.close();

	}

}
