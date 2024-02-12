package app;
//Maiza Falcon Rojas
//CST-239
//02/07/2024
//I used source code from the following place Activity 2 part 1 Word Document

import java.util.Random;

/**
 * Represents a generic superhero with basic attributes and methods for combat.
 */
public class SuperHero {

	private String name; 
	protected int health; 
	private boolean isDead; 
	
	/**
     * Initializes a new superhero with a given name and health.
     *
     * @param name   The name of the superhero.
     * @param health The initial health of the superhero.
     */
	public SuperHero(String name, int health ) { 
		
		
		// Initialize internal variables 
		this.name = name; 
		this.health = health; 
	}
	
	/**
     * Performs an attack on the opponent superhero, incorporating any special powers.
     *
     * @param opponent The superhero being attacked.
     */
	public void attack(SuperHero opponent) {
        // Generate a random number between 1 and 10
        Random rand = new Random();
        int damage = rand.ints(1, (10 + 1)).findFirst().getAsInt();

        // Use special power before attacking
        useSpecialPower(opponent);

        // Set the health of the provided opponent
        opponent.determineHealth(damage);
        System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage, opponent.health));
    }

	 /**
     * This method is meant to be overridden by subclasses to define unique special powers.
     *
     * @param opponent The superhero on which the special power is applied.
     */
        protected void useSpecialPower(SuperHero opponent) {
        // Default implementation (no special power)
    }
    
    /**
     * Checks if the superhero is dead.
     *
     * @return True if the superhero is dead, false otherwise.
     */
	public boolean isDead() {
		
		//Return dead state 
		return this.isDead; 
	}
	
	  /**
     * Determines the health of the superhero after receiving damage.
     *
     * @param damage The amount of damage received.
     */
	protected void determineHealth(int damage) {
		
		// If no more health then mark as dead 
		// Else subtract damage from health and continue
		if(this.health - damage <= 0) {
			
			this.health = 0;
			this.isDead = true; 
		}
		else {
			
			this.health = this.health - damage; 
		}
	}
	
}
	
	
	
	