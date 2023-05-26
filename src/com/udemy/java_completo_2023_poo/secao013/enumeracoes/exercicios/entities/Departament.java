package com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities;

public class Departament {

	private String name;

	public Departament() {
	}
	
	public Departament(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Departament [name=" + name + "]";
	}

	
}
