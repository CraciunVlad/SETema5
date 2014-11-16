/**
 * 
 */
package shipyard;

import interfaces.CivilianShip;
import interfaces.MilitaryShip;
import ships.Battlecruiser;
import ships.Battleship;
import ships.Bomber;
import ships.Cruiser;
import ships.Destroyer;
import ships.EspionageProbe;
import ships.HeavyFighter;
import ships.LightFighter;

/**
 * A class that extends {@link Shipyard} and generates {@link MilitaryShip} implementations objects
 * @author KMD
 * 
 */
public class MilitaryShipyard extends Shipyard {
	/**
	 * Implementation of the abstract method getMilitaryShip(String shipType) in {@link Shipyard} ;
	 *
	 */	
	public MilitaryShip getMilitaryShip(String shipType) {
		if (shipType == null) {
			return null;
		}
		if (shipType.equalsIgnoreCase("Light Fighter")) {
			return new LightFighter();
		}
		if (shipType.equalsIgnoreCase("Heavy Fighter")) {
			return new HeavyFighter();
		}
		if (shipType.equalsIgnoreCase("Battlecruiser")) {
			return new Battlecruiser();
		}
		if (shipType.equalsIgnoreCase("Battleship")) {
			return new Battleship();
		}
		if (shipType.equalsIgnoreCase("Bomber")) {
			return new Bomber();
		}
		if (shipType.equalsIgnoreCase("Cruiser")) {
			return new Cruiser();
		}
		if (shipType.equalsIgnoreCase("Destroyer")) {
			return new Destroyer();
		}
		if (shipType.equalsIgnoreCase("Espionage Probe")) {
			return new EspionageProbe();
		}

		return null;
	}
	/**
	 * Implementation of the abstract method getCivilianShip(String shipType) in {@link Shipyard} ;
	 * It will always return null in this implementation.
	 * 
	 */	
	public CivilianShip getCivilianShip(String ShipType) {
		System.out
				.println("This ia a Military Shipyard and it will not produce a civilian ship \n");
		return null;
	}

}
