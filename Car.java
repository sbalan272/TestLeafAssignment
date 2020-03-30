package week1.day1;

public class Car {

	// Java --> Strict
	// ***Within a CLASS cannot use the same Variable name***
	String regNumber = "TN03F3031";
	
	//String --> Data type (Class)
	//regNumber --> Variable Name (Start with Lower Case --> Camel Case)
	// = --> Assignment Operator
	// "TN03F3031" --> value
	
	
	//age of car
	short carAge = 10;
	float caAge = 2.5f;
	double cAge = 10.244;
	
	//punctured or not (Yes / No)
	boolean isPuncture = true;
	
	// brand Logo
	
	char brandLogo = 'H';
	
	
	public static void main(String[] args) {
		System.out.println("Good Start");
		
		// call these variables from the main method
		
		// Syntax
		// 1. Create a reference variable name for the class
		// Example: ClassName ref = new ClassName();
		
		Car strike = new Car();
		
		// How do I call the variable?
		// Syntax
		// ref.variableName;
		// 
		char brandLogo2 = strike.brandLogo;
		System.out.println(brandLogo2);
		
		String regNumber2 = strike.regNumber;
		System.out.println(regNumber2);
		//System.out.println(strike.regNumber);
		

	}

}
