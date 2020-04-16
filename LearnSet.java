package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> shoes = new HashSet<String>();
		shoes.add("Reebok");
		shoes.add("Nike");
		shoes.add("Puma");
		shoes.add("Nike"); // Will not allow duplicate values
		
		System.out.println(shoes.size());
		
		for (String eachShoe : shoes) {
			System.out.println(eachShoe);
		}
		

	}

}
