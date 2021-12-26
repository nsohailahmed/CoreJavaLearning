package com.thecodecraving.basics.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int num; // variable declaration
		num = 10; // assigned value of 10
		
		System.out.println("Assigned value is  : "+num);
		
		int newNum =0 ;
		
		newNum += num; // newNum = newNum + num
		System.out.println(newNum);
		
		newNum *= num; // newNum = newNum * num
		System.out.println(newNum);
		newNum -= num; // newNum = newNum - num
		System.out.println(newNum);
		newNum /= num; // newNum = newNum / num
		System.out.println(newNum);
	}
}
