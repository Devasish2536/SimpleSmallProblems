package com.devatechno.question2;

import java.util.Scanner;

public class WordNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a word ");
		String str = s.next();
		int length = str.length();
		printRepeatedWord(str, length - 1);
		s.close();
	}

	private static void printRepeatedWord(String str, int length) {
		if (length > 0) {
			StringBuffer stringBuffer = new StringBuffer();
			while (length >= 0) {
				stringBuffer.append(str);
				if (length > 0)
					stringBuffer.append(",");
				length--;
			}
			System.out.print(stringBuffer);

		} else {
			System.out.println("String Can not be empty");
		}
	}

}
