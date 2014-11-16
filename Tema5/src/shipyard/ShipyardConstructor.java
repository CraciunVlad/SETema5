/**
 * 
 */
package shipyard;

/**
 * @author KMD
 *
 */
public class ShipyardConstructor {

	public static Shipyard getShipyard(String shypyardType) {
		if (shypyardType.equalsIgnoreCase("Military")) {
			return new MilitaryShipyard();
		} else if (shypyardType.equalsIgnoreCase("Civilian")) {
			return new CivilianShipyard();
		}
		System.out
				.println("Invalid input \n The input has to be of Military or Civilian value \n");
		return null;
	}

}
