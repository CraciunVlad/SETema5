/**
 * 
 */
package shipyards;

import interfaces.MilitaryShipyard;

/**
 * @author KMD
 * 
 */
public class LightFighter implements MilitaryShipyard {
	private String Name;
	private int StructuralIntegrity;
	private int ShieldPower;
	private int WeaponPower;
	private int CargoCapacity;
	private int BaseSpeed;
	private int FuelConsumption;
	static int count = 0;
	

	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "LF " + newName;
	}

	public void showStats() {
		// TODO Auto-generated method stub

	}

}
