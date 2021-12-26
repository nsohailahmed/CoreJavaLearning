package com.thecodecraving.basics;

public class ConstructorLearning {
	
	String name;
	String action;
	int target;
	
	public ConstructorLearning() {
		
	}
	
	ConstructorLearning(String name, String action, int target){
		this.name = name;
		this.action = action;
		this.target = target;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("What is Constructor?");
		
		ConstructorLearning constructorLearning1 = new ConstructorLearning();
		ConstructorLearning constructorLearning2 = new ConstructorLearning("The Code Craving", "Subscribe us", 1000);
		
		System.out.println(constructorLearning1.name);
		System.out.println(constructorLearning1.action);
		System.out.println(constructorLearning1.target);
		
		System.out.println(constructorLearning2.name);
		System.out.println(constructorLearning2.action);
		System.out.println(constructorLearning2.target);
		
		System.out.println("Purpose of Constructor.");
		System.out.println("Types of Constructor");
		System.out.println("1. Default Constructor");
		System.out.println("1. Parameterized Constructor");
	}

}
