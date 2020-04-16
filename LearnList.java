package week3.day2;

import java.util.*;
import java.io.*;
import java.awt.List;
import java.util.ArrayList;

public class LearnList {

	public static void main(String[] args) {
		
		
//		To import the List -- Should be from "java.util" package
//		List is an interface so cannot create OBJ for an interface
//		Generic <String> - you will not allowed to have any data type. Only allowed is String
//		Generic <String> - Data type allowed by the collection
//		Class which implements the List -- ArrayList
		
		
//		List<String> shoes = new ArrayList<String>();
		java.util.List<String> shoes = new ArrayList<String>();
		shoes.add("Reebok");
		shoes.add("Nike");
		shoes.add("Puma");
		shoes.add("Nike"); // Allows duplicate values
		
				
//		Logic to Sort the list
		Collections.sort(shoes);
		
		System.out.println(shoes.size());
		for (String eachShoe : shoes) {
			System.out.println(eachShoe);
		}
		
		
	}

}
