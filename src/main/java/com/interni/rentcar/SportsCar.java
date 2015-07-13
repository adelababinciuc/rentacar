package com.interni.rentcar;

public class SportsCar extends Car {
	private boolean sportsCarTurboBoost;

	public SportsCar() {
		super();
	}

	public boolean isSportsCarTurboBoost() {
		return sportsCarTurboBoost;
	}

	public void setSportsCarTurboBoost(boolean sportsCarTurboBoost) {
		this.sportsCarTurboBoost = sportsCarTurboBoost;
	}

}
