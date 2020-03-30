package week1.day1;

public class Mobile {

	boolean lockMobile = true;
	int contactNumber = 988495147;
	String contactName = "Saravanan";	
	
	
	public static void main(String[] args) {
		System.out.println("Am Ready");
		
		Mobile obj1 = new Mobile();
		boolean lockMobile2 = obj1.lockMobile;
		int contactNumber2 = obj1.contactNumber;
		String contactName2 = obj1.contactName;
		
		System.out.println(lockMobile2);
		System.out.println(contactNumber2);
		System.out.println(contactName2);
		
		// System --> Final Class
		// out --> instance of PrintStream type
		// println --> method

	}

}
