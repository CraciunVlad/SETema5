/**
 * 
 */
package ships;

import interfaces.CivilianShip;

/**
 * @author KMD
 *
 */
public class LargeCargoShip extends ShipStats implements CivilianShip {

	static int Count = 0;
	public LargeCargoShip()
	{
		Count = Count + 1;
		this.Name = "LC #" + Count;
		this.StructuralIntegrity = 12000;
		this.ShieldPower = 25;
		this.WeaponPower = 5;
		this.CargoCapacity = 25000;
		this.BaseSpeed = 7500;
		this.FuelConsumption = 50;
		System.out.println("The Large Cargo Ship " + this.Name
				+ " has been created");
	}
	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "LC " + newName;
	}

}
