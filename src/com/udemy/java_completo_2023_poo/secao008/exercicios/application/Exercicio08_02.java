package com.udemy.java_completo_2023_poo.secao008.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao008.exercicios.entities.Employee;

public class Exercicio08_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Employee employee = new Employee();
		System.out.println("Name:");
		employee.name = input.nextLine();
		System.out.println("Salary:");
		employee.grossSalary = input.nextDouble();
		System.out.println("Tax:");
		employee.tax = input.nextDouble();

		System.out.println();
		System.out.println(employee);
		System.out.println();

		System.out.println("Which percentage to increase salary?");
		employee.increaseSalary(input.nextDouble());
		System.out.println("Update Data|" + employee);

		input.close();

	}

}
