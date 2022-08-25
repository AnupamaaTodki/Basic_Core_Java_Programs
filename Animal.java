package com.basicprograms;

public class Animal {
	String name;
	String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
		
	}
	public void displayAnimalInfo() {
		System.out.println("Name of the anumal is = " +this.name);
		System.out.println("Color of the animal is = " +this.color);
		
	}
	
	public static void main(String[] args) {
		Animal cat = new Animal("cat" , "White");
		cat.displayAnimalInfo();
	}

}
