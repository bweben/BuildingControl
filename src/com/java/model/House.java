package com.java.model;

import java.util.ArrayList;

public abstract class House extends Building {

	protected Person owner;
	protected int rooms;
	protected Location location;
	protected ArrayList<Person> renters;

	public House() {
		super();
	}

	public Person getOwner() {
		return this.owner;
	}

	public int getRooms() {
		return this.rooms;
	}

	/**
	 * 
	 * @param newOwner
	 */
	public void changeOwner(Person newOwner) {
		// TODO - implement House.changeOwner
		throw new UnsupportedOperationException();
	}

	public void addRoom() {
		// TODO - implement House.addRoom
		throw new UnsupportedOperationException();
	}

	public void removeRoom() {
		// TODO - implement House.removeRoom
		throw new UnsupportedOperationException();
	}

	public ArrayList<Person> getRenters() {
		return this.renters;
	}

	/**
	 *
	 * @param renters
	 */
	public void setRenters(ArrayList<Person> renters) {
		this.renters = renters;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String getTypeName() {
		return "House";
	}
}