package app;
//Maiza Falcon Rojas
//CST-239
//02/07/2024
//I used source code from the following place Activity 2 part 2 Word Document

/**
 * A class representing a gun, extending the Weapon class.
 */
public class Gun extends Weapon {

/**
* {@inheritDoc}
*/	
public void fireWeapon(int power) {
		
		System.out.println("In Gun.fireWeapon() with a power of " + power); 
	}

/**
 * Fires the gun with a default power.
 */
public void fireWeapon() {
	
	System.out.println("In overloaded Gun.fireWeapon()"); 
	super.fireWeapon(5);
}

/**
 * {@inheritDoc}
 */
public void activate(boolean enable) {
	
	System.out.println("In the Gun.activate() with an enable of " + enable); 
}
}
