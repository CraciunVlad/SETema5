/**
 * 
 */
package shipyard;

import interfaces.MilitaryShip;

/**
 * @author KMD
 * 
 */
public class HeavyFighter extends ShipStats implements MilitaryShip {
	static int Count = 0;

	public HeavyFighter() {
		Count = Count + 1;
		this.Name = "HF #" + Count;
		this.StructuralIntegrity = 10000;
		this.ShieldPower = 25;
		this.WeaponPower = 150;
		this.CargoCapacity = 100;
		this.BaseSpeed = 10000;
		this.FuelConsumption = 75;
		System.out.println("The Heavy Fighter " + this.Name
				+ " has been created");

	}

	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "HF " + newName;
	}

	public void fireWeapons() {
		System.out.println("The Heavy Fighter " + this.Name
				+ " has fired all weapons \n");

	}

}
