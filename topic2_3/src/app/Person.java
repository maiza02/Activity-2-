package app;
//Maiza Falcon Rojas
//CST-239
//02/08/2024
//I used source code from the following place Activity 2 part 3 Word Document


/**
 * Represents a person with a first name and a last name.
 */
public class Person {
	
	private String firstName = "Mark";
	private String lastName = "Reha"; 
	
	/**
     * Constructs a new Person object with the specified first name and last name.
     *
     * @param firstName the first name of the person
     * @param lastName  the last name of the person
     */
	public Person(String firstName, String lastName) {
		
		this.firstName = firstName; 
		this.lastName = lastName; 
	}

    /**
     * Constructs a new Person object by copying the values from another Person object.
     *
     * @param person the person to copy
     */
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName(); 
		
	}
	
	
	 /**
     * Gets the first name of the person.
     *
     * @return the first name
     */
	public String getFirstName() {
		
		return firstName; 
	}
	
	
	/**
     * Gets the last name of the person.
     *
     * @return the last name
     */
	public String getLastName() {
		
		return lastName; 
	}
	
	
	/**
     * Checks if this person is equal to another object. Two persons are considered equal
     * if they have the same first name and last name.
     *
     * @param other the object to compare with
     * @return true if the objects are equal, false otherwise
     */
	@Override
	public boolean equals(Object other) {
		
		if(other == this) {
			System.out.println("I am here in other == this"); 
			return true; 
		}
		
		if(other == null) {
			System.out.println("I am here in other == null");
			return false; 
		}
		
		if(getClass() !=other.getClass()) {
			System.out.println("I am here in getClass() !=other.getClass()"); 
			return false; 
		}
		
		Person person = (Person)other; 
		return (this.firstName == person.firstName && this.lastName == person.lastName); 
	}
	
	
	/**
     * Returns a string representation of this person, including the class name,
     * first name, and last name.
     *
     * @return the string representation
     */
	@Override 
	public String toString() {
		return "My Class is " + getClass() + " " + this.firstName + " " + this.lastName; 
	}
	
}

