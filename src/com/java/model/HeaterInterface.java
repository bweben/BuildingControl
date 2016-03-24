package com.java.model;

public interface HeaterInterface {

	abstract double calculatePower();

	/**
	 * 
	 * @param house
	 */
	abstract double heating(House house);

}