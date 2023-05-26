package com.udemy.java_completo_2023_poo.secao008.exercicios.entities;

import java.util.Iterator;

public class Estudante {

	public String nome;
	public double[] notas = { 0, 0, 0 };
	public double notaFinal;
	public boolean aprovado;

	public void calcularAprovacao() {

		notas[0] = notas[0] * 0.3;
		notas[1] = notas[1] * 0.35;
		notas[2] = notas[2] * 0.35;

		for (double nota : notas) {
			notaFinal = notaFinal + nota;
		}
		aprovado = (notaFinal >= 6.0) ? true : false;
	}

	public void exibirResultadoFinal() {
		if (aprovado) {
			System.out.println(this);
			System.out.println("PASS");
		} else {
			System.out.println(this);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", notaFinal);
		}
	}

	@Override
	public String toString() {
		return "FINAL GRADE: " + String.format("%.2f", notaFinal);
	}
}
