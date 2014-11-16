
package interfaces;

/**
 * Interface for the Civilian type ships whit methods that are used in all
 * Civilian type ships
 * 
 * @author KMD
 * 
 */
public interface CivilianShip {
	/**
	 * Abstract method for renaming a ship
	 * 
	 * @param newName
	 *            -String representing the new desired name for the ship
	 */
	abstract public void rename(String newName);

	/**
	 * Abstract method for displaying the stats of a ship
	 */
	abstract public void showStats();

	/**
	 * Abstract method for adding a number of passengers to the ship
	 * 
	 * @param nrPassengers
	 *            - integer representing the desired amount of passenger to
	 *            board the ship
	 */
	abstract public void loadPassengers(int nrPassengers);

	/**
	 * Abstract method for subtracting a number of passengers from the ship
	 * 
	 * @param nrPassengers
	 *            - integer representing the desired amount of passenger to
	 *            leave the ship
	 */
	abstract public void unloadPassengers(int nrPassengers);
}
