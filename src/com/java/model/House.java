public abstract class House extends Building {

	private Person owner;
	private int rooms;
	private Location location;
	private Person renters;

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

	public Person getRenters() {
		return this.renters;
	}

	/**
	 * 
	 * @param renters
	 */
	public void setRenters(Person renters) {
		this.renters = renters;
	}

	public void getAttribute() {
		// TODO - implement House.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement House.setAttribute
		throw new UnsupportedOperationException();
	}

}