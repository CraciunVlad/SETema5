/**
 * 
 */
package ships;

import interfaces.MilitaryShip;

/**
 * @author KMD
 *
 */
public class Cruiser extends ShipStats implements MilitaryShip {

	static int Count = 0;
	public Cruiser()
	{
			 
		Count = Count + 1;
		this.Name = "CR #" + Count;
		this.StructuralIntegrity = 27000;
		this.ShieldPower = 50;
		this.WeaponPower = 400;
		this.CargoCapacity = 800;
		this.BaseSpeed = 15000;
		this.FuelConsumption = 300;
		System.out.println("The Cruiser " + this.Name
				+ " has been created");

	}
	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "CR " + newName;
	}

	
	public void fireWeapons() {
		System.out.println("The Cruiser " + this.Name
				+ " has fired all weapons \n");

	}

}
