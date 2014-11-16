/**
 * 
 */
package interfaces;

/**
 * @author KMD
 * 
 */
public interface CivilianShip {
	abstract public void rename(String newName);

	abstract public void showStats();

	abstract public void loadPassangers(int nrPassangers);

	abstract public void unloadPassangers(int nrPassangers);
}
