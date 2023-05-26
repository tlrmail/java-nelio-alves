package com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.Departament;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.HourContract;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities.Worker;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.enums.WorkerLevel;

public class Sistema111 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter department's name: ");
		String departamentName = input.next();
		Departament departament = new Departament(departamentName);

		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String name = input.next();
		System.out.println("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(input.next().toUpperCase());
		System.out.println("Base salary: ");
		Double salary = input.nextDouble();
		System.out.println("How many contracts to this worker? ");
		int n = input.nextInt();

		Worker worker = new Worker(name, level, salary, departament);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.println("Date (DD/MM/YYYY): ");
			String strData = input.next();
			Date date = sdf.parse(strData);
			System.out.println("Value per hour: ");
			Double value = input.nextDouble();
			System.out.println("Duration: ");
			Integer hours = input.nextInt();
			HourContract contract = new HourContract(date, value, hours);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String strData = input.next();

		String split[] = strData.split("/");
		Integer month = Integer.valueOf(split[0]);
		Integer year = Integer.valueOf(split[1]);
		Double income = worker.income(year, month);

		System.out.println("Name: " + worker.getName() + "\r\n" + "Department: " + worker.getDepartament().getName()
				+ "\r\n" + "Income for " + strData + ": " + String.format("%.2f", income) + "\r\n" + "");

		input.close();

	}

}
