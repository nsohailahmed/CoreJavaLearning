package com.thecodecraving.basics;

public class VariableLearning {
	
	int number = 4;
	
	static int subscriber = 1000;
	
	public static void main(String[] args) {
		String name = "The Code Craving";
		System.out.println("What is Variable?");
		System.out.println("Types of Variable");
		System.out.println("1. Local Variable"+name);
		System.out.println("2. Instance Variable"+new VariableLearning().number);
		System.out.println("3. Static Variable"+subscriber);
	}

}
