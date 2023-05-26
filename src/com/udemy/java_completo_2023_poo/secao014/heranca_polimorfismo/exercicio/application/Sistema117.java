package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.Employee;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.OutsourcedEmployee;

public class Sistema117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner input = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees:");
		int n = input.nextInt();
		for(int i = 0; i < n;i++) {
			System.out.println("Employee #"+(i+1)+" data:");
			System.out.println("Outsourced (y/n)? ");
			char out = input.next().toLowerCase().charAt(0);
			System.out.println("Name: ");
			String name = input.next();
			System.out.println("Hours: ");
			Integer hours = input.nextInt();
			System.out.println("Value per hour: ");
			Double valuePerHour = input.nextDouble();
			if(out == 'y') {
				OutsourcedEmployee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, valuePerHour);
				System.out.println("Additional charge: ");
				outsourcedEmployee.setAdditionalCharge(input.nextDouble());
				employees.add(outsourcedEmployee);
			}else {
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
			}
		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee employee: employees) {
			System.out.println(employee);
		}
		
		input.close();
		
	}
}
