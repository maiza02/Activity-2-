package app;
//Maiza Falcon Rojas
//CST-239
//02/08/2024
//I used source code from the following place Activity 2 part 3 Word Document


/**
 * A class to test the functionality of the Person class.
 */
public class Test {

	
	/**
     * The main method that serves as the entry point of the program.
     *
     * @param args command-line arguments (not used in this program)
     */
	public static void main(String[] args) {
		
		//Create new Person Objects
		Person person1 = new Person("Justin", "Reha"); 
		Person person2 = new Person("Briana", "Reha"); 
		Person person3 = new Person(person1); 
		
		//Test Object equality 
		if(person1 == person2)
			System.out.println("These persons are identical using ==");
		else 
			System.out.println("These persons are not identical using ==");
		
		//Test Object Equality
		if(person1.equals(person2))
			System.out.println("These persons are identical using equals()"); 
		else 
			System.out.println("These persons are not identical using equals()"); 
		
		// Test Copy Constructor
		if(person1.equals(person3))
			System.out.println("These copied person is identical using equals()"); 
		else 
			System.out.println("These copied person is not identical using equals()"); 
		
		//Print the Objects
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);

	}

}
