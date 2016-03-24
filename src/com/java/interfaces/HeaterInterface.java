package com.java.interfaces;

import com.java.model.House;

public interface HeaterInterface {

	abstract double calculatePower();

	/**
	 * 
	 * @param house
	 */
	abstract double heating(House house);

}