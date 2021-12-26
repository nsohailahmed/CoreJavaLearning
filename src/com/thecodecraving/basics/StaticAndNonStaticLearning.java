package com.thecodecraving.basics;

public class StaticAndNonStaticLearning {
	
	static String title = "The Code Craving";
	String action = "Subscribe our channel";
	
	public static void main(String[] args) {
		
		System.out.println("What is static in java");
		System.out.println(title);
		System.out.println(getTitle());
		
		System.out.println("What is non-static in java");
		StaticAndNonStaticLearning learning = new StaticAndNonStaticLearning();
		System.out.println(learning.action);
		System.out.println(learning.getAction());
	}
	
	static String getTitle() {
		return title;
	}
	
	String getAction() {
		System.out.println(title);
		
		return action;
	}

}
