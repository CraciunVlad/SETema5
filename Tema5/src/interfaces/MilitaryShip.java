
package interfaces;

/**
 * @author KMD
 * 
 */
public interface MilitaryShip {
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
	 * Abstract method for interacting whit the offensive capabilities of the
	 * ship
	 */
	abstract public void fireWeapons();

}
