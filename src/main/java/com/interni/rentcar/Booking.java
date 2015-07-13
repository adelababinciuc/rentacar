package com.interni.rentcar;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookingId;
	
	@Temporal (TemporalType.DATE)
	private Date bookingStartDate;

	@Temporal (TemporalType.DATE)
	private Date bookingEndDate;

	private boolean bookingPickedUp;

	@Temporal (TemporalType.DATE)
	private Date bookingReturnDate;

	@ManyToOne (cascade = CascadeType.ALL)
	private Car car;

	public Booking() {
		super();
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingStartDate() {
		return bookingStartDate;
	}

	public void setBookingStartDate(Date bookingStartDate) {
		this.bookingStartDate = bookingStartDate;
	}

	public Date getBookingEndDate() {
		return bookingEndDate;
	}

	public void setBookingEndDate(Date bookingEndDate) {
		this.bookingEndDate = bookingEndDate;
	}

	public boolean isBookingPickedUp() {
		return bookingPickedUp;
	}

	public void setBookingPickedUp(boolean bookingPickedUp) {
		this.bookingPickedUp = bookingPickedUp;
	}

	public Date getBookingReturnDate() {
		return bookingReturnDate;
	}

	public void setBookingReturnDate(Date bookingReturnDate) {
		this.bookingReturnDate = bookingReturnDate;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
