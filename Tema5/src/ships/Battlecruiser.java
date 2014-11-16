/**
 * 
 */
package ships;

import interfaces.MilitaryShip;

/**
 * @author KMD
 *
 */
public class Battlecruiser extends ShipStats implements MilitaryShip {

	static int Count = 0;
	
	public Battlecruiser() {
		Count = Count + 1;
		this.Name = "BC #" + Count;
		this.StructuralIntegrity = 70000;
		this.ShieldPower = 400;
		this.WeaponPower = 700;
		this.CargoCapacity = 700;
		this.BaseSpeed = 10000;
		this.FuelConsumption = 250;
		System.out.println("The Battlecruiser " + this.Name
				+ " has been created");

	}

	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "BC " + newName;
	}

	public void fireWeapons() {
		System.out.println("The Battlecruiser " + this.Name
				+ " has fired all weapons \n");

	}

}
