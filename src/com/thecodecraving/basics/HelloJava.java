package com.thecodecraving.basics;

public class HelloJava {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		System.out.println(StaticAndNonStaticLearning.title);
		
		StaticAndNonStaticLearning learning = new StaticAndNonStaticLearning();
		
		System.out.println(learning.getAction());
		
	}

}
