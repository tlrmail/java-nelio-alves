package com.udemy.java_completo_2023_poo.secao008.exercicios.entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - this.tax;
	}

	public void increaseSalary(double percentage) {
		this.grossSalary = this.grossSalary * (1 + percentage / 100);
	}

	@Override
	public String toString() {
		return "Employee: " + this.name + ", $" + String.format("%.2f", this.netSalary());
	}
}
