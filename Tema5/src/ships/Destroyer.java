/**
 * 
 */
package ships;

import interfaces.MilitaryShip;

/**
 * @author KMD
 *
 */
public class Destroyer extends ShipStats implements MilitaryShip {

	static int Count = 0;
	
	public Destroyer() {
		Count = Count + 1;
		this.Name = "DD #" + Count;
		this.StructuralIntegrity = 110000;
		this.ShieldPower = 500;
		this.WeaponPower = 2000;
		this.CargoCapacity = 2000;
		this.BaseSpeed = 5000;
		this.FuelConsumption = 1000;
		System.out.println("The Destroyer " + this.Name
				+ " has been created");

	}

	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "DD " + newName;
	}

	public void fireWeapons() {
		System.out.println("The Destroyer " + this.Name
				+ " has fired all weapons \n");

	}

}
