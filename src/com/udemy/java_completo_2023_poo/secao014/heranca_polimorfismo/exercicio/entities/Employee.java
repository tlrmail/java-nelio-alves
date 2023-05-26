package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

public class Employee {

	private String name;
	protected Integer hours;
	protected Double valuePerDate;

	public Employee() {

	}

	public Employee(String name, Integer hours, Double valuePerDate) {
		this.name = name;
		this.hours = hours;
		this.valuePerDate = valuePerDate;
	}

	public Double payment() {
		return this.hours * this.valuePerDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerDate() {
		return valuePerDate;
	}

	public void setValuePerDate(Double valuePerDate) {
		this.valuePerDate = valuePerDate;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.payment();
	}
	
}
