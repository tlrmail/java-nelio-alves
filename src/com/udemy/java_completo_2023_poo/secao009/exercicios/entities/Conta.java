package com.udemy.java_completo_2023_poo.secao009.exercicios.entities;

public class Conta {

	private final double TAX = 5.00;
	private String numero;
	private String nomeCliente;
	private double saldo;

	public Conta(String numero, String nomeCliente) {
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}

	public Conta(String numero, String nomeCliente, double initialDeposit) {
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.deposito(initialDeposit);
	}

	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Depósito de R$" + String.format("%.2f",valor) + " efetuado. Saldo de " + String.format("%.2f",this.saldo) + ".");
	}

	public void saque(double valor) {
		this.saldo = this.saldo - (valor + TAX);
		System.out.println("Saque de R$" + String.format("%.2f",valor) + " efetuado. Saldo de " + String.format("%.2f",this.saldo) + ".");
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Dados da Conta:\n[Cliente: " + this.nomeCliente + ", número: " + this.numero + ", saldo: "
				+ String.format("%.2f",this.saldo) + "]";
	}

}
