package app;
//Maiza Falcon Rojas
//CST-239
//02/07/2024
//I used source code from the following place Activity 2 part 1 Word Document

import java.util.Random;

/**
 * The main class representing the superhero battle game.
 */
public class Game {

	
	/**
     * The main method that initiates and runs the superhero battle game.
     *
     * @param args The command-line arguments (not used in this program).
     */
	public static void main(String[] args) {
		
		// Create a random health between 1 and 1000
		Random rand = new Random(); 
		int health1 = rand.ints(1, (1000 + 1)).findFirst().getAsInt(); 
		int health2 = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
		
		// Create Superman and Batman 
		System.out.println("Creating our Super Heroes......");
		Superman superman = new Superman(health1); 
		Batman batman = new Batman(health2); 
		System.out.println("Super Heroes created"); 
		
		// Run the game until one of the Super Heroes is dead
		System.out.println("Running our game....."); 
		while(!superman.isDead() && !batman.isDead()) {
			
			//Attack each other
			superman.attack(batman);
			batman.attack(superman);
			
			// See if anybody survived
			if(superman.isDead()) {				
				System.out.println("Batman defeated Superman"); 
			}
			if(batman.isDead()) {
				System.out.println("Superman defeated Batman"); 
			}
				
		}
		

	}

}
