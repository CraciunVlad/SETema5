/**
 * 
 */
package main;

import interfaces.CivilianShip;
import interfaces.MilitaryShip;
import shipyard.Shipyard;
import shipyard.ShipyardConstructor;

/**
 * A game that represents the basic Spaceship types in a style related to OGame
 * @author KMD
 * 
 */
public class SpaceGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Shipyard tulcea = ShipyardConstructor.getShipyard("Modern");

		Shipyard constanta = ShipyardConstructor.getShipyard("military");
		MilitaryShip viforul = constanta.getMilitaryShip("Light Fighter");
		viforul.rename("Viforul");
		viforul.showStats();
		viforul.fireWeapons();

		MilitaryShip marasti = constanta.getMilitaryShip("Heavy Fighter");
		marasti.rename("Marasti");
		marasti.showStats();
		marasti.fireWeapons();

		MilitaryShip lightFighter1 = constanta.getMilitaryShip("Light Fighter");
		lightFighter1.showStats();
		lightFighter1.fireWeapons();

		MilitaryShip lightFighter2 = constanta.getMilitaryShip("Light Fighter");
		lightFighter2.showStats();
		lightFighter2.fireWeapons();

		Shipyard tomis = ShipyardConstructor.getShipyard("civilian");

		CivilianShip mircea = tomis.getCivilianShip("Colony Ship");
		mircea.rename("Mircea");
		mircea.showStats();
		mircea.loadPassengers(250);
		mircea.unloadPassengers(245);

		CivilianShip smallCargo1 = tomis.getCivilianShip("Small Cargo Ship");
		smallCargo1.showStats();
		smallCargo1.loadPassengers(250);
		smallCargo1.unloadPassengers(245);

		CivilianShip smallCargo2 = tomis.getCivilianShip("Small Cargo Ship");
		smallCargo2.showStats();

	}

}
