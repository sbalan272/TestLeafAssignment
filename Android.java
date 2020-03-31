package week1.day1;

public class Android {

//	Create a class (Android)
//	Create 5 variables (long, Boolean, String, int, float)
//	Call them from main method and Print the value
	
	long contactNumber = 9884951472l;
	boolean isAndroid = true;
	String osName = "AndroidOS";
	int osNumber = 1678;
	float osVersion = 1.5f;
		
	public static void main(String[] args) {
		
		Android obj3 = new Android();
		
		long contactNumber2 = obj3.contactNumber;
		boolean isAndroid2 = obj3.isAndroid;
		String osName2 = obj3.osName;
		int osNumber2 = obj3.osNumber;
		float osVersion2 = obj3.osVersion;
		
		System.out.println("Contact Number: " + contactNumber2);
		System.out.println("Android: " + isAndroid2);
		System.out.println("Operating System: " + osName2);
		System.out.println("OS No: " + osNumber2);
		System.out.println("Version No: " + osVersion2);
	
	}

}
