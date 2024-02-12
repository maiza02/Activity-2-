package app;
//Maiza Falcon Rojas
//CST-239
//02/07/2024
//I used source code from the following place Activity 2 part 1 Word Document

/**
 * Represents a superhero with a unique special power - Batman.
 */
public class Batman extends SuperHero {

	/**
     * Initializes Batman with a given health.
     *
     * @param health The initial health of Batman.
     */
    public Batman(int health) {
        super("Batman", health);
    }

    
    /**
     * Overrides the useSpecialPower method to implement Batman's special power.
     * Batman's special power decreases the opponent's health by an additional 5 points.
     *
     * @param opponent The superhero being attacked.
     */
    @Override
    protected void useSpecialPower(SuperHero opponent) {
        // Batman's special power: Decrease opponent's health by an additional 5 points
        opponent.determineHealth(5);
        System.out.println("Batman used his special power!");
    }
}