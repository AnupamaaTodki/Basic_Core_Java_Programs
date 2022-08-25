package com.basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		
		if(year >= 1000 && year <= 9999) {
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("Entered year is leap year");
			}
			else{
				System.out.println("Entered year is not leap year");
				}
			scanner.close();
			}

	}

}
