package app;
//Maiza Falcon Rojas
//CST-239
//02/07/2024
//I used source code from the following place Activity 2 part 2 Word Document

/**
 * A class representing a game that uses weapons.
 */
public class Game {
	
	/**
     * The entry point of the game.
     *
     * @param args Command-line arguments.
     */
	public static void main(String[] args) {
		
		Bomb weapon1 = new Bomb();
		Gun weapon2 = new Gun(); 
		weapon1.activate(true);
		weapon2.activate(true);
		weapon1.fireWeapon(10);
		weapon2.fireWeapon(5);
		weapon1.fireWeapon();
		weapon2.fireWeapon();
	}

}
