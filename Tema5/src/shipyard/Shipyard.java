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
	abstract MilitaryShip getMilitaryShip(String shipType);
	abstract CivilianShip getCivilianShip(String ShipType);
}
