package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

public class OutsourcedEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		// TODO Auto-generated constructor stub
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerDate, Double additionalCharge) {
		super(name, hours, valuePerDate);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return this.valuePerDate * this.hours + this.additionalCharge * 1.1;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public String toString() {
		return this.getName() + " - " + this.payment();
	}
	
}
