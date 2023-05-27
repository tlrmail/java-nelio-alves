package com.udemy.java_completo_2023_poo.secao015.excecoes.model.entities;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationSolucaoMuitoRuim {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	public ReservationSolucaoMuitoRuim() {
		// TODO Auto-generated constructor stub
	}

	public ReservationSolucaoMuitoRuim(Integer number, Date checkin, Date checkout) {
		this.roomNumber = number;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Long duration() {
		long difference = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumber() {
		return roomNumber;
	}

	public void setNumber(Integer number) {
		this.roomNumber = number;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	@Override
	public String toString() {
		return "Reservation: Room " + this.roomNumber + ", checkin: " + sdf.format(checkin) + ", checkout: "
				+ sdf.format(checkout)+", duration: " + this.duration() + " nights.";
	}

}
