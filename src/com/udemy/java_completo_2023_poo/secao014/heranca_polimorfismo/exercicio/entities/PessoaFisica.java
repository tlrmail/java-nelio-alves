package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

public class PessoaFisica extends Pessoa {
	
	private Double gastosComSaude;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(String nome, Double rendaAtual, Double gastosComSaude) {
		super(nome, rendaAtual);
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double calcularImposto() {
		Double retorno = 0.0;
		if(this.getRendaAtual() < 20000.00){
			retorno = this.getRendaAtual() * 0.15 - this.gastosComSaude * 0.5;
		}else {
			retorno = this.getRendaAtual() * 0.25 - this.gastosComSaude * 0.5;
		}
		return retorno;
	}
	
	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
}
