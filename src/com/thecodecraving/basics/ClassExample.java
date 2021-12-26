package com.thecodecraving.basics;

public class ClassExample {
	
	int propertyOne = 1;//instance variable or property
	int properetyTwo = 2;
	String state = "Active";
	
	public static void main(String[] args) {
		
		ClassExample classExample = new ClassExample();
		
		System.out.println(classExample.getState());
		classExample.showState();
	}
	
	String getState() {
		return state;
	}
	
	void showState() {
		System.out.println(state);
	}

}
