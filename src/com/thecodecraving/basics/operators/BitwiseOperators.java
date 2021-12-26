package com.thecodecraving.basics.operators;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		int a =5, b=7, c =8;
		//a in binary 0101
		//b in binary 0111
		//c in binary 1000
		
		System.out.println("Bitwise OR --> "+(a|b|c));
		
		System.out.println("Bitwise AND --> "+(a&b&c));
		
		System.out.println("Bitwise XOR --> "+(a^b));
		
		System.out.println("Bitwise compliment --> "+~a);
		
		System.out.println("Left shift operator --> "+(a<<1));
		
		System.out.println("Right shift operator --> "+(c>>2));
	}

}
