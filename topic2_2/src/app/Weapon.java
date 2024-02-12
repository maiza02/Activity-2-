package app;
//Maiza Falcon Rojas
//CST-239
//02/07/2024
//I used source code from the following place Activity 2 part 2 Word Document

/**
 * An abstract class representing a weapon.
 */
public abstract class Weapon {

	 /**
     * Fires the weapon with a specified power.
     *
     * @param power The power of the weapon.
     */
	public void fireWeapon(int power) { 
		
		System.out.println("In Weapon.fireWeapon() with a power of " + power); 
	}
	
	
	/**
     * Activates or deactivates the weapon.
     *
     * @param enable True to activate, false to deactivate.
     */
	public abstract void activate(boolean enable); 
	
}
