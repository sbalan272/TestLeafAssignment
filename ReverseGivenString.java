package week1.day3;

public class ReverseGivenString {

	public static void main(String[] args)
	{
		String txt2 = "Welcome";
		String reverse = "";
		
		for(int i = txt2.length()-1; i >=0; i--)
		{
			reverse = reverse + txt2.charAt(i);
		}
		
		System.out.println("Reversed string is: " + reverse);
		
	}

}
