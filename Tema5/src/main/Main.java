/**
 * 
 */
package main;

import interfaces.MilitaryShip;
import shipyard.Shipyard;
import shipyard.ShipyardConstructor;
import shipyard.MilitaryShipyard;




/**
 * @author KMD
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*MilitaryShip ms1= new LightFighter();
	ms1.showStats();
	ms1.fireWeapons();
	MilitaryShip ms2= new LightFighter();
	ms2.showStats();
	ms2.fireWeapons();
	MilitaryShip ms3= new HeavyFighter();
	ms3.showStats();
	ms3.fireWeapons();
	CivilianShip cs1=new SmallCargoShip();
	cs1.showStats();
	cs1.unloadPassangers(0);
	cs1.unloadPassangers(5);
	CivilianShip cs2=new ColonyShip();
	cs2.showStats();
	cs2.unloadPassangers(0);
	cs2.unloadPassangers(5);
	cs2.loadPassangers(5000);
	cs2.loadPassangers(750);
	
	*/
		
		
		
		
		Shipyard tulcea= ShipyardConstructor.getShipyard("Modern");
		
		Shipyard constanta= ShipyardConstructor.getShipyard("military");
		MilitaryShip viforul=constanta.getMilitaryShip("Light Fighter");
		viforul.rename("Viforul");
		viforul.showStats();
		viforul.fireWeapons();
		
		MilitaryShip marasti=constanta.getMilitaryShip("Heavy Fighter");
		marasti.rename("Marasti");
		marasti.showStats();
		marasti.fireWeapons();
	}

}
