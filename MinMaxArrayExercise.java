package week1.day4;

import java.util.Arrays;

public class MinMaxArrayExercise {

	public static void main(String[] args) {
		
//		Assignment 1:
//		Find minimum and maximum numbers of given array. (Using Sort)
//		Input = int[] a = {200, 500, 10, 3000};
//		Output = ?
		
		int[] a = {200, 500, 10, 3000};
		
		int min = a[0];
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);

	}

}
