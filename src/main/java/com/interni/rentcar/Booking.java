package com.interni.rentcar;

import java.util.Date;

public class Booking {
	private long bookingId;

	private Date bookingStartDate;

	private Date bookingEndDate;

	private boolean bookingPickedUp;

	private Date bookingReturnDate;

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
