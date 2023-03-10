package Assn12;

import java.util.Arrays;

public class SmallestAndSecondSmallest {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Array: " +
		Arrays.toString(array));
		System.out.println("Smallest element: " +
		getSmallest(array));
		System.out.println("Second smallest element: " +
		getSecondSmallest(array));
		}
		public static int getSmallest(int[] array) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
		if (array[i] < smallest) {
		smallest = array[i];
		}
		}
		return smallest;
		}
		public static int getSecondSmallest(int[] array) {
		int[] sortedArray = array.clone();
		Arrays.sort(sortedArray);
		return sortedArray[1];
		}
		}

