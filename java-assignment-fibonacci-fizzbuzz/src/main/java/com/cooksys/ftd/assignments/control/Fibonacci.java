package com.cooksys.ftd.assignments.control;

import java.util.Arrays;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * The Fibonacci sequence is simply and recursively defined: the first two
 * elements are `1`, and every other element is equal to the sum of its two
 * preceding elements. For example:
 * <p>
 * [1, 1] => [1, 1, 1 + 1] => [1, 1, 2] => [1, 1, 2, 1 + 2] => [1, 1, 2, 3] =>
 * [1, 1, 2, 3, 2 + 3] => [1, 1, 2, 3, 5] => ...etc
 */
public class Fibonacci {
	/**
	 * Calculates the value in the Fibonacci sequence at a given index. For example,
	 * `atIndex(0)` and `atIndex(1)` should return `1`, because the first two
	 * elements of the sequence are both `1`.
	 *
	 * @param i the index of the element to calculate
	 * @return the calculated element
	 * @throws IllegalArgumentException if the given index is less than zero
	 */

	public static void illegalArgumentConditions(Boolean condition, String statement) throws IllegalArgumentException {

		if (condition) {
			throw new IllegalArgumentException(statement);
		}
	}

	public static int atIndex(int i) {

		illegalArgumentConditions(i < 0, "index value is less than 0");

		int firstNumber = 1, secondNumber = 1;
		for (int n = 0; n < i; n++) {
			int newNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = newNumber;
		}
		return firstNumber;
	}

	/**
	 * Calculates a slice of the fibonacci sequence, starting from a given start
	 * index (inclusive) and ending at a given end index (exclusive).
	 *
	 * @param start the starting index of the slice (inclusive)
	 * @param end   the ending index of the slice(exclusive)
	 * @return the calculated slice as an array of int elements
	 * @throws IllegalArgumentException if either the given start or end is
	 *                                  negative, or if the given end is less than
	 *                                  the given start
	 */
	public static int[] slice(int start, int end) {
		illegalArgumentConditions(start < 0, "Start is less than 0");
		illegalArgumentConditions(end < 0, "End is  less than 0");
		illegalArgumentConditions(end < start, "End is less than given start");

		// Calculating the slice
		int slice = end - start;

		// Creating array to return
		// Determining the size of the array
		int[] fibArray;
		fibArray = new int[slice];

		for (int i = 0; i < slice; i++) {
			fibArray[i] = atIndex(start + i);
		}
		;

		// System.out.println(Arrays.toString(fibArray));

		return fibArray;

	}

	/**
	 * Calculates the beginning of the fibonacci sequence, up to a given count.
	 *
	 * @param count the number of elements to calculate
	 * @return the beginning of the fibonacci sequence, up to the given count, as an
	 *         array of int elements
	 * @throws IllegalArgumentException if the given count is negative
	 */

	public static int[] fibonacci(int count) throws IllegalArgumentException {

		illegalArgumentConditions(count < 0, "Count is negative");

		int countArray[];
		countArray = new int[count];

		for (int i = 0; i < count; i++) {
			countArray[i] = atIndex(i);
		}
		;

		// System.out.println(Arrays.toString(slice(1,6)));
		// System.out.println(Arrays.toString(countArray));

		return countArray;

	}

}
