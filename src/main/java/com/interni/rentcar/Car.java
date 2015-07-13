package com.interni.rentcar;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Car {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long carId;
	
	private  long carRegNo;
	
	private String carModel;
	
	private String carBrand;
	
	private String carColour;
	
	private int carSeatsNo;
	
	@OneToMany (mappedBy = "car")
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
