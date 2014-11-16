/**
 * 
 */
package ships;

import interfaces.CivilianShip;

/**
 * @author KMD
 *
 */
public class Recycler extends ShipStats implements CivilianShip {

	static int Count = 0;
	public Recycler()
	{
		Count = Count + 1;
		this.Name = "R #" + Count;
		this.StructuralIntegrity = 16000;
		this.ShieldPower = 10;
		this.WeaponPower = 1;
		this.CargoCapacity = 20000;
		this.BaseSpeed = 2000;
		this.FuelConsumption = 300;
		System.out.println("The Recycler " + this.Name
				+ " has been created");
	}
	public void rename(String newName){
		if (newName == null) {
		System.out.println("The name is Invalid");
		return;
	}
	this.Name = "R " + newName;
}

}
