
package app;
//Maiza Falcon Rojas
//CST-239
//02/07/2024
//I used source code from the following place Activity 2 part 1 Word Document


/**
 * Represents a superhero with a unique special power - Superman.
 */
public class Superman extends SuperHero {

	 /**
     * Initializes Superman with a given health.
     *
     * @param health The initial health of Superman.
     */
	public Superman(int health) {
        super("Superman", health);
    }
	
	
	/**
     * Overrides the useSpecialPower method to implement Superman's special power.
     * Superman's special power increases his own health by 10 points.
     *
     * @param opponent The superhero on which the special power is applied.
     */
    @Override
    protected void useSpecialPower(SuperHero opponent) {
        // Superman's special power: Increase his own health by 10 points
        this.health += 10;
        System.out.println("Superman used his special power to heal!");
    }
}