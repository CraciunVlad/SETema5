/**
 * 
 */
package shipyard;

import interfaces.CivilianShip;
import interfaces.MilitaryShip;

/**
 * Abstract class for introducing a level of abstractization between the main tasks
 * and the Shipyards {@link CivilianShipyard} and {@link MilitaryShipyard}
 * @author KMD
 */
public abstract class Shipyard {
	/**
	 * Abstract method for deciding the ship created .
	 * The implementation will be in the {@link CivilianShipyard} and {@link MilitaryShipyard} classes
	 * @param shipType - String that represents the type of ship wanted
	 * @return - an implementation of {@link MilitaryShip}
	 */
	public abstract MilitaryShip getMilitaryShip(String shipType);
	/**
	 * Abstract method for deciding the ship created .
	 * The implementation will be in the {@link CivilianShipyard} and {@link MilitaryShipyard} classes
	 * @param shipType - String that represents the type of ship wanted
	 * @return - an implementation of {@link CivilianShip}
	 */
	public abstract CivilianShip getCivilianShip(String shipType);
}
