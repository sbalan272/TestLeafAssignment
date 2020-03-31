package week1.day2;

public class CallMe {

	public static void main(String[] args) {
		
		// calling the methods from Math Class through CallMe class
		
		Math m = new Math();
		int add = m.add(7, 8);
		System.out.println("Addition: " + add);
		
		int multiply = m.multiply(2, 3);
		System.out.println("Multiplication: " + multiply);
		
		// **static --> single references not a multiple references 
		// No need to create an object/reference variable to call
		// Purely for not to consume more memory
		// Syntax --> ClassName.methodName();
		// Math.division(); --> local variable
		
		int division = Math.division(30, 5);
		System.out.println("Division: " + division);

	}

}
