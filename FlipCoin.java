package com.basicprograms;

import java.util.Scanner;

public class FlipCoin {
public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to flip coin");
		int numberOfTimes = scanner.nextInt();
		int tail = 0;
		int head = 0;
		
		if(numberOfTimes > 0) {
			for(int i = 0; i < numberOfTimes; i++) {
				double value = Math.random();
				if(value < 0.5) {
					tail++;
				}
				else {
					head++;
				}
			}
			double percentageOfHead=(head*100)/numberOfTimes;
			double percentageOfTail=(tail*100)/numberOfTimes;
			scanner.close();
			System.out.println("Head count  :" +head);
			System.out.println("Tail count  :" +tail);
			System.out.println("Percentage of head  :" +percentageOfHead);
			System.out.println("Percentage of tail  :" +percentageOfTail);
			
		}System.out.println("Enter the positive number");

	}

}
