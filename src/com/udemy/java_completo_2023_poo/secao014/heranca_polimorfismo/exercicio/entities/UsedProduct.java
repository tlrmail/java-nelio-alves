package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {

	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return this.getName() + "(Used), " + " $" + String.format("%.2f", this.price) + " " + "(Manufacture date: "
				+ sdf.format(this.manufactureDate) + ")";
	}

}
