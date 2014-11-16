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
public class MilitaryShipyard extends Shipyard {

	
	public MilitaryShip getMilitaryShip(String shipType) {
		if(shipType == null)
		{
			return null;
		}
		if(shipType.equalsIgnoreCase("Light Fighter"))
		{
			return new LightFighter();
		}
		if(shipType.equalsIgnoreCase("Heavy Fighter"))
		{
			return new HeavyFighter();
		}
			
		return null;
	}

	
	public CivilianShip getCivilianShip(String ShipType) {
		System.out.println("This ia a Military Shipyard and it will not produce a civilian ship \n");
		return null;
	}




}
