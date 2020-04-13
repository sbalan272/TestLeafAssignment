package week3.day1;


//Exactly like a class
//Interface (I) do not have implementation. It has only method signature (abstract) not body of the method
//abstract -- just a base not a full implementation
// Keyword Abstract -- not required in code. Because Interface is 100% Abstract

// Usage: I will design Interface first and then supported with documentation
// Java Doc is very useful

public interface HouseDesign {
	
	/** -- Java Doc:
	 * @author KIRUTHIKA
	 * This method helps to choose the common color for the building
	 * @param color -- This is the color of the house in String format
	 */
	
	public void chooseColor ();
	
	/*
	 * public and default are only allowed Access Modifiers. Because it is only a desgin not a implementation
	 * 
	 */ 
	
	public void designBasement ();
	
	/** -- Java Doc:
	 * @author KIRUTHIKA
	 * This method helps to find how many floors the house will
	 * @return int -- Number of floors
	 */
	
	public int getNumberOfFloors ();
	

}
