package com.basicprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
        scanner.close();

	}

}
