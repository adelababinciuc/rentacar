package com.interni.rentcar;

import java.util.List;

public class Car {
 
	private long carId;
	
	private  long carRegNo;
	
	private String carModel;
	
	private String carBrand;
	
	private String carColour;
	
	private int carSeatsNo;
	
	private List<Booking> bookings;
	
	public Car(){
		
	}

	public long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public long getCarRegNo() {
		return carRegNo;
	}

	public void setCarRegNo(long carRegNo) {
		this.carRegNo = carRegNo;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

	public int getCarSeatsNo() {
		return carSeatsNo;
	}

	public void setCarSeatsNo(int carSeatsNo) {
		this.carSeatsNo = carSeatsNo;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	
	
	
	
}
