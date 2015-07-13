package com.interni.rentcar;

import javax.persistence.Entity;

@Entity
public class FamilyCar extends Car{
	
	private boolean familyCarTrailer;
	
	public FamilyCar(){
		
	}

	public boolean isFamilyCarTrailer() {
		return familyCarTrailer;
	}

	public void setFamilyCarTrailer(boolean familyCarTrailer) {
		this.familyCarTrailer = familyCarTrailer;
	}
	
	
	
	
}
