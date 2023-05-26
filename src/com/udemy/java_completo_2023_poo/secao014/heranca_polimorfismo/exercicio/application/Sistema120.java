package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.Circle;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.Rectangle;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.Shape;
import com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities.enums.Color;

public class Sistema120 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();

		System.out.println("Enter the number of shapes: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			input.nextLine();
			System.out.println("Shape #" + (i + 1) + " data: ");
			System.out.println("Rectangle or Circle (r/c)? ");
			char opc = input.nextLine().toLowerCase().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.nextLine().toUpperCase());
			if (opc == 'r') {
				System.out.println("Width: ");
				Double width = input.nextDouble();
				System.out.println("Height: ");
				Double height = input.nextDouble();
				shapes.add(new Rectangle(color, width, height));
			} else if (opc == 'c') {
				System.out.println("Radius: ");
				Double radius = input.nextDouble();
				shapes.add(new Circle(color, radius));
			}

		}

		System.out.println("SHAPE AREAS: ");
		for (Shape shape : shapes) {
			System.out.println(shape.area());
		}

		input.close();
	}

}
