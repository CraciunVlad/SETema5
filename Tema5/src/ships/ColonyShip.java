/**
 * 
 */
package ships;

import interfaces.CivilianShip;

/**
 * @author KMD
 *
 */
public class ColonyShip extends ShipStats implements CivilianShip {
	static int Count = 0;
	public ColonyShip()
	{
		
		Count = Count + 1;
		this.Name = "Colony #" + Count;
		this.StructuralIntegrity = 30000;
		this.ShieldPower = 100;
		this.WeaponPower = 50;
		this.CargoCapacity = 7500;
		this.BaseSpeed = 2500;
		this.FuelConsumption = 1000;
		this.PassangerCapacity= 1000;
		System.out.println("The Colony Ship " + this.Name
				+ " has been created");

		
	}
	public void rename(String newName) {
		if (newName == null) {
			System.out.println("The name is Invalid");
			return;
		}
		this.Name = "C " + newName;
	}

}
