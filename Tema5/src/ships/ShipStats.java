/**
 * 
 */
package ships;

import interfaces.CivilianShip;
import interfaces.MilitaryShip;

/**Abstract class for the general parameters of every ship 
 * and implementations of various methods from {@link CivilianShip} and {@link MilitaryShip} Interfaces
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
	
	
	/**
	 * Implemented method for displaying the stats of a ship. Implemented from
	 * {@link CivilianShip} and {@link MilitaryShip} Interfaces
	 */
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
	
	/**
	 * Implemented method for adding a number of passengers to the ship.
	 * Implemented from {@link CivilianShip} Interface for all ships.
	 * 
	 * @param nrPassengers
	 *            - integer representing the desired amount of passenger to
	 *            board the ship
	 */
	public void loadPassengers(int nrPassengers) {
		if (PassangerCapacity == 0) {
			System.out.println(this.Name + " can not acomadate passangers \n");
			return;
		}
		if (nrPassengers <= (PassangerCapacity - PassangerCount)) {
			this.PassangerCount = this.PassangerCount + nrPassengers;
			System.out.println(this.Name + " has loaded " + nrPassengers
					+ " taking the number of current passangers to "
					+ this.PassangerCount + "\n");
		}
	}

	/**
	 * Implemented method for subtracting a number of passengers from the ship.
	 * Implemented from {@link CivilianShip} Interfacefor all ships.
	 * 
	 * @param nrPassengers
	 *            - integer representing the desired amount of passenger to
	 *            leave the ship
	 */
	public void unloadPassengers(int nrPassengers) {

		if (PassangerCapacity == 0) {
			System.out.println(this.Name + " can not acomadate passangers \n");
			return;
		}
		if (nrPassengers <= 0) {
			System.out.println("Invalid input \n");
			return;
		}
		if (PassangerCount < nrPassengers) {
			System.out.println(this.Name
					+ " has less passangers than it is required to unload \n");
			return;
		}
		PassangerCount = PassangerCount - nrPassengers;
		System.out.println(this.Name + " has unloaded " + nrPassengers
				+ "passangers taking the number of current passangers to "
				+ this.PassangerCount + "\n");

	}

}
