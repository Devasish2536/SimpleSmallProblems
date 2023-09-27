package com.devatechno.question3;

import java.util.Scanner;

public class SecondString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String input ");
		String sentence = s.nextLine();
		int length = sentence.length();
		if (length == 0) {
			System.out.println("Input String cannot be empty");
		} else {
			printSecondString(sentence);
		}
	}

	private static void printSecondString(String sentence) {
		String[] split = sentence.split(" ");
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
			if (i % 2 == 0)
				buffer.append(split[i]);
			if (i % 2 != 0)
				buffer.append(",");
			if (i == split.length - 1)
				buffer.append(".");
		}

		System.out.println(buffer);

	}

}
