/**
 * 
 */
package ships;

import interfaces.MilitaryShip;

/**
 * @author KMD
 *
 */
public class EspionageProbe extends ShipStats implements MilitaryShip {

	static int Count = 0;
	public EspionageProbe()
	{
		Count = Count + 1;
		this.Name = "Probe #" + Count;
		this.StructuralIntegrity = 1000;
		this.CargoCapacity = 5;
		this.BaseSpeed = 100000000;
		this.FuelConsumption = 1;
		System.out.println("The Recycler " + this.Name
				+ " has been created");
	}
	public void rename(String newName){
		if (newName == null) {
		System.out.println("The name is Invalid");
		return;
	}
	this.Name = "Probe " + newName;
}


	public void fireWeapons() {
		System.out.println("The Probe " + this.Name
				+ " has no weapons \n");

	}
	


}
