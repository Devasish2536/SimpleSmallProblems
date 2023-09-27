package com.devatechno.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingArrayElement {

	public static void main(String[] args) {
		// for user input
		Scanner s = new Scanner(System.in);
		// size should be even
		System.out.print("Enter the size of an array ");
		int size = s.nextInt();
		int[] array = {};
		int positive = 0, negative = 0;
		// condition for checking size is even or not
		if (size % 2 == 0) {
			array = new int[size];
			int num = 0;
			for (int i = 0; i < size; i++) {
				num = s.nextInt();
				if (num >= 0) {
					array[i] = num;
					positive++;
				} else {
					array[i] = num;
					negative++;
				}

			}
			// condition for checking total number of positive elements should be equal to
			// negative element count
			if (positive != negative) {
				System.out.println(
						"Invalid Array elements, Make sure total positive numbers and negative number must be equals");
			} else {
				// condition for checking any duplicate elements are present
				if (!checkForDuplicateElements(array))
					sortArrayElements(array, size);
				else
					System.out.println("Duplicate Elements are present ");
			}
		} else {
			System.out.println("Array size should be even ");
		}
		s.close();
	}

	private static boolean checkForDuplicateElements(int[] array) {
		boolean hasDuplicate = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					hasDuplicate = true;
			}
		}
		return hasDuplicate;
	}

	private static void sortArrayElements(int[] array, int size) {
		// separating positive and negative number into separate list
		List<Integer> positiveList = new ArrayList<>();
		List<Integer> negativeList = new ArrayList<>();
		for (int k : array) {
			if (k > 0)
				positiveList.add(k);
			else
				negativeList.add(k);
		}
		// sorting positive list in descending order
		positiveList = positiveList.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		// sorting negative list in ascending order
		negativeList = negativeList.stream().sorted().collect(Collectors.toList());
		// print alternatively the list elements
		for (int i = 0; i < array.length; i++) {
			if (i < positiveList.size())
				System.out.print(positiveList.get(i) + " ");
			if (i < negativeList.size()) {
				System.out.print(negativeList.get(i) + " ");
			}
		}
	}

}
