/**
 * 
 */
package shipyard;

/**
 * @author KMD
 * 
 */
public abstract class ShipStats {

	String Name = "ShipName";
	int StructuralIntegrity = 0;
	int ShieldPower = 0;
	int WeaponPower = 0;
	int CargoCapacity = 0;
	int BaseSpeed = 0;
	int FuelConsumption = 0;
	int PassangerCapacity = 0;
	int PassangerCount = 0;
	
	
	public void showStats() {
		System.out.println("This are the stats of the " + this.Name + "\n");
		System.out.println("StructuralIntegrity : " + this.StructuralIntegrity+ "\n" 
				+ "ShieldPower : " + this.ShieldPower + "\n"
				+ "WeaponPower : " + this.WeaponPower + "\n" 
				+ "CargoCapacity : "+ this.CargoCapacity + "\n" 
				+ "BaseSpeed : " + this.BaseSpeed+ "\n"
				+ "FuelConsumption : " + this.FuelConsumption + "\n"
				+ "PassagerCapacity : " + this.PassangerCapacity + "\n"
				+ "PassangerCount : " + this.PassangerCount + "\n" );

	}
	
	public void loadPassangers(int nrPassangers)
	{
		if(PassangerCapacity==0)
		{
			System.out.println(this.Name+" can not acomadate passangers \n");
			return;
		}
		if(nrPassangers<= (PassangerCapacity-PassangerCount))
		{
			this.PassangerCount=this.PassangerCount+nrPassangers;
			System.out.println(this.Name + " has loaded " + nrPassangers
					+ " taking the number of current passangers to "
					+ this.PassangerCount + "\n");
		}
	}

	public void unloadPassangers(int nrPassangers) {

		if (PassangerCapacity == 0) {
			System.out.println(this.Name + " can not acomadate passangers \n");
			return;
		}
		if (nrPassangers <= 0) {
			System.out.println("Invalid input \n");
			return;
		}
		if (PassangerCount < nrPassangers) {
			System.out.println(this.Name
					+ " has less passangers than it is required to unload \n");
			return;
		}
		PassangerCount = PassangerCount - nrPassangers;
		System.out.println(this.Name + " has unloaded " + nrPassangers
				+ " taking the number of current passangers to "
				+ this.PassangerCount + "\n");

	}

}
