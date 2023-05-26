package com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private List<HourContract> contracts = new ArrayList<>();
	private Departament departament;

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public Double income(Integer year, Integer month) {
		double sum = this.baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract contract : contracts) {
			cal.setTime(contract.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH) + 1;
			if (year == c_year && month == c_month)
				sum = sum + contract.totalValue();
		}
		return sum;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + "]";
	}

}
