package app;
//Maiza Falcon Rojas
//CST-239
//02/07/2024
//I used source code from the following place Activity 2 part 2 Word Document

/**
 * A class representing a bomb, extending the Weapon class.
 */
public class Bomb extends Weapon {

	public void fireWeapon(int power) {
		
		System.out.println("In Bomb.fireWeapon() with a power of " + power); 
	}
	
	 /**
     * Fires the bomb with a default power.
     */
	public void fireWeapon() {
		
		System.out.println("In overloaded Bomb.fireWeapon()"); 
		super.fireWeapon(10);
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public void activate(boolean enable) {
	
		System.out.println("In the Bomb.activate() with an enable of " + enable); 
	}
} 
