package week1.day3;

public class LearnString {

	public static void main(String[] args) {
		
		// Way 1:
		String txt = "Welcome To TestLeaf"; // String Literal
		String txt1 = "ver 2.0";
		System.out.println(txt);

		// String is collection of sequence of characters
		// COUNT of String
		// txt.length(); -- local variable
		// length is a function
		int count = txt.length();
		System.out.println(count);
		
		// charAt() -- method
		// txt.charAt(3); -- local variable
		// index 3 refers to "t" in "TestLeaf"
		char charAt = txt.charAt(3);
		System.out.println(charAt);
		
		
		// I know the character want to find the position of the character
		// txt.indexOf('s'); -- local variable
		// Purely case sensitive
		// Right to Left
		int indexOf = txt.indexOf('s');
		System.out.println(indexOf);
		
		// txt.lastIndexOf('s') -- local variable
		int lastIndexOf = txt.lastIndexOf('s');
		System.out.println(lastIndexOf);
		
		
		// trim --> it deletes the spaces at the first and at the last. Will not trim the space in middle.
		// txt.trim();
		String trim = txt.trim();
		System.out.println(trim);
		
		// concatination
		System.out.println(txt.concat(txt1));
		System.out.println(txt + txt1);
		
		// Convert to lower and upper case
		System.out.println(txt.toLowerCase());
		System.out.println(txt.toUpperCase());
		
		
		// Arrays --> Store collection of character under single variables
		
		//toCharArray -- String to character
		// txt.toCharArray(); -- local variable
		char[] charArray = txt.toCharArray();
		System.out.println(charArray[6]);
		
		
		// split the given string based on delimiter (here delimiter is space)
		// Split -- returns collection of words
		// txt.split(" "); -- local variable
		// (" ") --> Refers to delimiter space in "String txt = "Welcome To TestLeaf";" --> that is why space given
		String[] split = txt.split(" ");
		System.out.println(split[2]);
		
		
		// Sub String with single argument
		// pick a portion from the entire string
		// txt.substring(11); -- local variable
		// String substring = txt.substring(11); -- answer is TestLeaf
		// String substring = txt.substring(15); -- answer is Leaf
		String substring = txt.substring(15);
		System.out.println(substring);
		
		
		// Sub String with double argument --> txt.substring(beginIndex, endIndex)
		// beginIndex -- is Inclusive
		// endIndex -- Exclusive (7-1 = 6 (index))
		// txt.substring(0, 7) -- local variable
		// answer is --> Welcome
		
		String substring2 = txt.substring(0, 7);
		System.out.println(substring2);
		
		
		// equals is the function to compare 2 different Strings
		// case sensitive
		System.out.println(txt1.equals("ver 2.0"));
		
		
		// equals is the function to compare 2 different Strings
		// not a case sensitive
		System.out.println(txt1.equalsIgnoreCase("Ver 2.0"));
		
		
		// startsWith() --- Validating entire string starts with given character or not
		// case sensitive
		System.out.println(txt1.startsWith("ve"));
		
		
		// endsWith() -- Validating entire string end with given character or not
		System.out.println(txt1.endsWith("0"));
		
		
		// replace
		System.out.println(txt1.replace('v', 'V'));
		
		
		// Way 2:
		// String obj = new String("TestLeaf"); // object
		// System.out.println(obj);
		
		
		

		
	}

}
