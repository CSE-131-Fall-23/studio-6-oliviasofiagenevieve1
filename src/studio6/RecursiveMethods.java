package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		// n = n + n/2;
		if (n == 0) {
			return 0;
		}
		else {
			return (1/(Math.pow(2, n) + geometricSum(n-1)));
		}
		
	}


	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array

		//Initialize index variables start and end such that they point to the first (0) and the last (sizeOfArray - 1) index of the array respectively.
		//Swap the element at the index start with the element at the index end.
		//Recursively call the reverse function.
		int first = array[0];
		int last = array[array.length - 1];
		//swap
		last--;
		first++;
		
		
		
			return new int[0];
		
	}
/* for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++){
				if (array[j-1] > array [j]){
				int k = array[j-1];
				array[j-1] = array[j];
				array[j] = k;
				/*
	
	
	
	
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}





/**
 * This method uses recursion to compute the greatest common divisor
 * for the two input values
 * 
 * @param p first operand
 * @param q second operand
 * @return greatest common divisor of p and q
 */
public static int gcd(int p, int q) {
	
		// FIXME compute the gcd of p and q using recursion
		
	/*Step 1: Declare two integers.
Step 2: Find the maximum of the two numbers.
Step 3: Use a while loop to check if the maximum number is divisible by both the given numbers.
Step 4: If it is divisible, then it is the LCM.*/
	
		return 0;
	
}
}
