/**
 * 
 */
package shipyard;

/**
 * A class that generates {@link MilitaryShipyard} and {@link CivilianShipyard} objects 
 * based on passed information that match statically implemented Strings "Military" and "Civilian" respectively
 * @author KMD
 *
 */
public class ShipyardConstructor {

	/**Method for generating  {@link MilitaryShipyard} or {@link CivilianShipyard} objects based on passed input
	 * @param shypyardType - Strings that match "Military" or "Civilian"
	 * @return - {@link MilitaryShipyard} or {@link CivilianShipyard} objects 
	 * or null if match not successful
	 */
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
