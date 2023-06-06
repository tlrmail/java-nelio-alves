package com.udemy.java_completo_2023_poo.secao018.interfaces.model.entities;

public abstract class Device {

	private String serialNumber;
	
	public Device() {
		// TODO Auto-generated constructor stub
	}
	
	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public abstract void processDoc(String doc);
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	
	
}
