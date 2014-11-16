/**
 * 
 */
package ships;

import interfaces.MilitaryShip;

/**
 * @author KMD
 *
 */
public class Bomber extends ShipStats implements MilitaryShip {

	static int Count = 0;
	public Bomber()
	{
			 	 	 	 
		Count = Count + 1;
		this.Name = "BB #" + Count;
		this.StructuralIntegrity = 75000;
		this.ShieldPower = 500;
		this.WeaponPower = 1000;
		this.CargoCapacity = 500;
		this.BaseSpeed = 4000;
		this.FuelConsumption = 1000;
		System.out.println("The Light Fighter " + this.Name
				+ " has been created");

	}
	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "BB " + newName;
	}

	
	public void fireWeapons() {
		System.out.println("The Bomber " + this.Name
				+ " has fired all weapons and released all bombs\n");


	}

}
