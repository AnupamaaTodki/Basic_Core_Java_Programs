package com.basicprograms;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		System.out.println("Enter a character :");
	      Scanner scanner = new Scanner(System.in);
	      char ch = scanner.next().charAt(0);
	      if((ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ') ||
	         (ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'||ch == ' '))
	      {
	         System.out.println("Given character is an vowel");
	      }
	      else
	      {
	         System.out.println("Given character is a consonant");
	      }
          scanner.close();
	}

}
