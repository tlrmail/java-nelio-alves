package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

public abstract class Pessoa {

	private String nome;
	private Double rendaAtual;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, Double rendaAtual) {
		this.nome = nome;
		this.rendaAtual = rendaAtual;
	}

	public abstract Double calcularImposto();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAtual() {
		return rendaAtual;
	}

	public void setRendaAtual(Double rendaAtual) {
		this.rendaAtual = rendaAtual;
	}

	@Override
	public String toString() {
		return this.nome + ": " + this.calcularImposto();
	}
}
