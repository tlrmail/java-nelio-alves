package com.udemy.java_completo_2023_poo.secao015.excecoes.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.udemy.java_completo_2023_poo.secao015.excecoes.model.excecao.DomainException;

public class ReservationSolucaoBoa {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	public ReservationSolucaoBoa() {
		// TODO Auto-generated constructor stub
	}

	public ReservationSolucaoBoa(Integer number, Date checkin, Date checkout) throws DomainException {
		if (!checkout.after(checkin)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date.");
		}
		this.roomNumber = number;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Long duration() {
		long difference = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Error in reservation: Reservation dates for update must be future dates.");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date.");
		}
		this.checkin = checkIn;
		this.checkout = checkOut;
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
				+ sdf.format(checkout) + ", duration: " + this.duration() + " nights.";
	}

}
