package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

public class PessoaJuridica extends Pessoa{

	private Integer numeroDeFuncionarios;

	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}
	
	public PessoaJuridica(String nome, Double rendaAtual, Integer numeroDeFuncionarios) {
		super(nome, rendaAtual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double calcularImposto() {
		Double retorno;
		if(this.numeroDeFuncionarios > 10) {
			retorno = this.getRendaAtual() * 0.14;
		}else {
			retorno = this.getRendaAtual() * 0.16;
		}
		return retorno;
	}
	
	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
}
