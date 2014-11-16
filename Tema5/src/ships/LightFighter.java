/**
 * 
 */
package ships;

import interfaces.MilitaryShip;

/**
 * @author KMD
 * 
 */
public class LightFighter extends ShipStats implements MilitaryShip {
	static int Count = 0;

	public LightFighter() {
		Count = Count + 1;
		this.Name = "LF #" + Count;
		this.StructuralIntegrity = 4000;
		this.ShieldPower = 10;
		this.WeaponPower = 50;
		this.CargoCapacity = 50;
		this.BaseSpeed = 12500;
		this.FuelConsumption = 20;
		System.out.println("The Light Fighter " + this.Name
				+ " has been created");

	}

	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "LF " + newName;
	}

	public void fireWeapons() {
		System.out.println("The Light Fighter " + this.Name
				+ " has fired all weapons \n");

	}
}
