package com.udemy.java_completo_2023_poo.secao018.interfaces.exercicio.entities;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

	private OnlinePaymentService service;

	public ContractService(OnlinePaymentService service) {
		this.service = service;
	}

	public void processContract(Contract contract, Integer months) {
		Calendar calendar = Calendar.getInstance();
		Date date = contract.getDate();
		for(int i = 0 ; i < months; i++) {
			calendar.setTime(date);
			calendar.add(Calendar.MONTH, i+1);
			date = calendar.getTime();
			Double amount = service.interest(contract.getTotalValue()/months, i+1);
			amount = amount + service.paymentFee(amount);
			Installment installment = new Installment(date, amount);
			contract.addInstallment(installment);
		}
	}
	
	public OnlinePaymentService getService() {
		return service;
	}

	public void setService(OnlinePaymentService service) {
		this.service = service;
	}

	
	
	
}
