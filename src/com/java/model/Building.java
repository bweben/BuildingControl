package com.java.model;

import com.java.interfaces.HeaterInterface;

public class Building {

	public Building() {
		dimension = new Dimension();
	}

	private Dimension dimension;
	private HeaterInterface heater;

	public Dimension getDimension() {
		return this.dimension;
	}

	public HeaterInterface getHeater() {
		return this.heater;
	}

	public String getTypeName() {
		return "Building";
	}
}