package com.udemy.java_completo_2023_poo.secao008.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.java_completo_2023_poo.secao008.Sistema63;
import com.udemy.java_completo_2023_poo.secao008.entities.Triangle;

public class Sistema64 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the measures of triangles X: ");
		Triangle triangleX = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		triangleX.calcularArea();
		
		System.out.println("Enter the measures of triangles Y: ");
		Triangle triangleY = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		triangleY.calcularArea();
		
		String resultado = (triangleX.getArea() > triangleY.getArea()) ? "Large area is X." : "Large area is Y" ;
		
		System.out.println(resultado);

		input.close();
	}

}
