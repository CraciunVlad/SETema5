/**
 * 
 */
package shipyard;

import interfaces.CivilianShip;
import interfaces.MilitaryShip;
import ships.ColonyShip;
import ships.LargeCargoShip;
import ships.Recycler;
import ships.SmallCargoShip;
import ships.SolarSatellite;

/**
 * A class that extends {@link Shipyard} and generates {@link CivilianShip} implementations objects
 * @author KMD
 * 
 */
public class CivilianShipyard extends Shipyard {

	/**
	 * Implementation of the abstract method getMilitaryShip(String shipType) in {@link Shipyard} ;
	 * It will always return null in this implementation.
	 * 
	 */	
	public MilitaryShip getMilitaryShip(String shipType) {
		System.out
				.println("This ia a Civilian Shipyard and it will not produce a military ship \n");
		return null;
	}

	/**
	 * Implementation of the abstract method getCivilianShip(String shipType) in {@link Shipyard} ;
	 * 
	 * 
	 */	
	public CivilianShip getCivilianShip(String shipType) {
		if (shipType == null) {
			return null;
		}
		if (shipType.equalsIgnoreCase("Colony Ship")) {
			return new ColonyShip();
		}
		if (shipType.equalsIgnoreCase("Small Cargo Ship")) {
			return new SmallCargoShip();
		}
		if (shipType.equalsIgnoreCase("Large Cargo Ship")) {
			return new LargeCargoShip();
		}
		if (shipType.equalsIgnoreCase("Recycler")) {
			return new Recycler();
		}
		if (shipType.equalsIgnoreCase("SolarSatellite")) {
			return new SolarSatellite();
		}

		return null;
	}

}
