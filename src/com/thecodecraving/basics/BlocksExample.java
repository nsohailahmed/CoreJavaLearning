package com.thecodecraving.basics;

public class BlocksExample {
	
	static {
		System.out.println("I am Static block");
	}
	
	{
		System.out.println("I am Instance block");
	}
	
	public static void main(String[] args) {
		new BlocksExample();
	}

}
