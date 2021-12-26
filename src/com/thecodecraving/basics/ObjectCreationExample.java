package com.thecodecraving.basics;

public class ObjectCreationExample {
	
	int x =10;

	public static void main(String[] args) {
		System.out.println("5 ways to create object in java");
		
		System.out.println("1. using new Operator");
		
		ObjectCreationExample obj1 = new ObjectCreationExample();
		
		System.out.println(obj1.x);
		System.out.println(obj1.getMessage("theCodeCraving, please subscribe."));
		
		
		System.out.println("2. by Class.newInstance() method");
		
		System.out.println("3. by newInstance() method of Constructor class");
		
		System.out.println("4. using Object.clone() method");
		
		System.out.println("5. by Object Serialization and Deserialization");
	}
	
	String getMessage(String name) {
		return name;
	}
}
