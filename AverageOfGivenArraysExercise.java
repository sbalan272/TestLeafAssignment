package week1.day4;

public class AverageOfGivenArraysExercise {

	public static void main(String[] args) {
		
		// Find the average of given array
		
		int [] a = {10, 40, 70, 100};
		int sum = 0;
		float avg;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			
		}
		avg = sum/a.length;
		System.out.println("Average: " + avg);

	}

}
