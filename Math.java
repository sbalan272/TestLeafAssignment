package week1.day2;

import org.apache.commons.math3.analysis.function.Multiply;

public class Math {

	//	Method Syntax (Signature):
	//	==========================
	//	1. access modifier --> public, private, protected, default (package)
	//	2. return type (output) --> data type + void
	//	3. method name (write meaningful names)
	//	4. arguments (input) --> data type + variable name (optional)
	
	//add method (4, 3) --> 7
	public int add (int a, int b) {
		int c = a+b;
		return c;
		// return a+b;
	}
	
	// multiply
	public int multiply (int a, int b) {
		int c = a*b;
		return c;
		// return a*b;
	}
	
	
	// **static --> single references not a multiple references
	// (No need to create an object to call)
	// Syntax --> ClassName.methodName();
	
	public static int division (int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		
		//Step 1: Reference
		// classname ref = new classname(); (reference variable)
		Math m = new Math();
		
		//Step 2: Call the method
		// ref.methodName();
		int add = m.add(3, 4);
		System.out.println("ADDITION: " + add);
		
		int multiply = m.multiply(5, 6);
		System.out.println("MULTIPLICATION: " + multiply);
		
		
	}
}
