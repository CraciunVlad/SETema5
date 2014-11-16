/**
 * 
 */
package shipyard;

import interfaces.CivilianShip;
import interfaces.MilitaryShip;

/**
 * @author KMD
 *
 */
public abstract class Shipyard {
	public abstract MilitaryShip getMilitaryShip(String shipType);
	public abstract CivilianShip getCivilianShip(String ShipType);
}
