public interface Heater {

	abstract double calculatePower();

	/**
	 * 
	 * @param house
	 */
	abstract double heating(House house);

}