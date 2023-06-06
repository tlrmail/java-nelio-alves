package com.udemy.java_completo_2023_poo.secao019.generics_set_map.application;

import java.util.ArrayList;
import java.util.List;

import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.Circle;
import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.Rectangle;
import com.udemy.java_completo_2023_poo.secao019.generics_set_map.entities.Shape;

public class Sistema143 {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0,2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShapes));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		System.out.println("Total area: " + totalArea(myCircles));
		
		
		
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s:list) {
			sum += s.area();
		}
		return sum;
	}
	
}
