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
public class CivilianShipyard extends Shipyard {

	
	public MilitaryShip getMilitaryShip(String shipType) {
		System.out.println("This ia a Civilian Shipyard and it will not produce a military ship \n");
		return null;
	}

	
	public CivilianShip getCivilianShip(String shipType)  {
		if(shipType == null)
		{
			return null;
		}
		if(shipType.equalsIgnoreCase("Colony Ship"))
		{
			return new ColonyShip();
		}
		if(shipType.equalsIgnoreCase("Small Cargo Ship"))
		{
			return new SmallCargoShip();
		}
			
		return null;
	}

}
