/**
 * 
 */
package ships;

import interfaces.CivilianShip;

/**
 * @author KMD
 *
 */
public class SolarSatellite extends ShipStats implements CivilianShip {

	static int Count = 0;
	public SolarSatellite()
	{
		Count = Count + 1;
		this.Name = "SS #" + Count;
		this.StructuralIntegrity = 2000;
		this.ShieldPower = 1;
		this.WeaponPower = 1;
		System.out.println("The Recycler " + this.Name
				+ " has been created");
	}
	public void rename(String newName){
		if (newName == null) {
		System.out.println("The name is Invalid");
		return;
	}
	this.Name = "SS " + newName;
}

}
