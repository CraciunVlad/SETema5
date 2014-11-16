/**
 * 
 */
package ships;

import interfaces.MilitaryShip;

/**
 * @author KMD
 *
 */
public class Battleship extends ShipStats implements MilitaryShip {

	static int Count = 0;
	 
	public Battleship() {
		Count = Count + 1;
		this.Name = "BS #" + Count;
		this.StructuralIntegrity = 60000;
		this.ShieldPower = 200;
		this.WeaponPower = 1000;
		this.CargoCapacity = 1500;
		this.BaseSpeed = 10000;
		this.FuelConsumption = 500;
		System.out.println("The Battleship " + this.Name
				+ " has been created");

	}
	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "BS " + newName;
	}

	public void fireWeapons() {
		System.out.println("The Battleship " + this.Name
				+ " has fired all weapons \n");

	}

}
