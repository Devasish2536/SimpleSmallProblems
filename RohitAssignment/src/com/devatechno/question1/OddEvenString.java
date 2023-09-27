package com.devatechno.question1;

import java.util.Arrays;

public class OddEvenString {

	public static void main(String[] args) {
		int array[] = new int[100];
		int num = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = num++;
		}
		System.out.println(Arrays.toString(array));
		StringBuffer oddnum = new StringBuffer();
		StringBuffer evennum = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evennum.append(array[i]);
				evennum.append(" ");
			} else {
				oddnum.append(array[i]);
				oddnum.append(" ");
			}
		}
		System.out.println("Even Numbers - " + evennum);
		System.out.println("Odd Numbers - " + oddnum);
	}

}
