package com.udemy.java_completo_2023_poo.secao017.interfaces.model.entities;

import java.time.Duration;

import com.udemy.java_completo_2023_poo.secao017.interfaces.model.entities.boasolucao.TaxService;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;
	
	public RentalService() {
		// TODO Auto-generated constructor stub
	}

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService tax) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = tax;
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
		
		double tax = this.taxService.tax(basicPayment);
		
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

	public TaxService getTaxsService() {
		return taxService;
	}

	public void setTaxService(TaxService tax) {
		this.taxService = tax;
	}
	
}