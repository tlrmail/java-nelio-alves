package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.salary.compareTo(o.getSalary());
	}

	@Override
	public String toString() {
		return "[name=" + name + ", salary=" + salary + "]";
	}
	
	
}
