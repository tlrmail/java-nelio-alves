package com.udemy.java_completo_2023_poo.secao015.excecoes.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservetionSolucaoRuim {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	public ReservetionSolucaoRuim() {
		// TODO Auto-generated constructor stub
	}

	public ReservetionSolucaoRuim(Integer number, Date checkin, Date checkout) {
		this.roomNumber = number;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Long duration() {
		long difference = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}

	public String updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			return "Error in reservation: Reservation dates for update must be future dates.";
			
		}else if(!checkOut.after(checkIn)) {
			return "Error in reservation: Check-out date must be after check-in date.";
		}
		this.checkin = checkin;
		this.checkout = checkout;
		return null;
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
