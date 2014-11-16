/**
 * 
 */
package shipyard;

import interfaces.CivilianShip;

/**
 * @author KMD
 *
 */
public class SmallCargoShip extends ShipStats implements CivilianShip {
	static int Count = 0;
	public SmallCargoShip()
	{
		Count = Count + 1;
		this.Name = "SC #" + Count;
		this.StructuralIntegrity = 4000;
		this.ShieldPower = 10;
		this.WeaponPower = 5;
		this.CargoCapacity = 5000;
		this.BaseSpeed = 5000;
		this.FuelConsumption = 10;
		System.out.println("The Small Cargo Ship " + this.Name
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
