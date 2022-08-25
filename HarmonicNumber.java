package com.basicprograms;

import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String args[])
    {
    	System.out.println("Enter the nth harmonic number");
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	if(n > 0)
    	{
    	double i, s = 0;
        for (i = 1; i <= n; i++)
            s = s + 1/i;
        System.out.printf("Nth harmonic value is"+s);       
        }
    	else {
    		System.out.println("Enter the positive number");
    	     }
    	scanner.close();
    	}
}
