package com.udemy.java_completo_2023_poo.secao014.heranca_polimorfismo.exercicio.entities;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return this.totalPrice() + " " + "(Customs Fee: $" + this.customsFee + ")";
	}
	
	public Double totalPrice() {
		return this.price + this.customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String toString() {
		return this.getName()+", $" + this.priceTag();
	}
	
}
