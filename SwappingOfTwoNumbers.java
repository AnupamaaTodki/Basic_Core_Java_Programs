package com.basicprograms;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a, b, temp;
	       Scanner scanner = new Scanner(System.in);  
	       System.out.println("Enter the value of a and b");  
	       a = scanner.nextInt();  
	       b = scanner.nextInt();  
	       System.out.println("before swapping numbers: "+a +"  "+ b);  
	       temp = a;  
	       a = b;  
	       b = temp;  
	       System.out.println("After swapping: "+a +"   " + b);  
	       System.out.println( );  
scanner.close();
	}
}
