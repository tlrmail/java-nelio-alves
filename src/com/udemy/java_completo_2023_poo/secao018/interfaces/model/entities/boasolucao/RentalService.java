package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities.boasolucao;

import java.time.Duration;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	private BrasilTaxService tax;
	
	public RentalService() {
		// TODO Auto-generated constructor stub
	}

	public RentalService(Double pricePerHour, Double pricePerDay, BrasilTaxService tax) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.tax = tax;
	}

	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = Math.ceil(minutes/60);
		double days = Math.ceil(hours/24);
		
		double basicPayment;
		if(hours <= 12.0) {
			 basicPayment = this.pricePerHour * hours;
		}else {
			basicPayment = this.pricePerDay * days;
		}
		
		double tax = this.tax.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrasilTaxService getTax() {
		return tax;
	}

	public void setTax(BrasilTaxService tax) {
		this.tax = tax;
	}
	
}