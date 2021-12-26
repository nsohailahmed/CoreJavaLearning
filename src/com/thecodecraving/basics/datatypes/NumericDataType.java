package com.thecodecraving.basics.datatypes;

public class NumericDataType {
	
	byte b ;
	short s;
	int i;
	long l;
	
	public static void main(String[] args) {
		
		NumericDataType dataType = new NumericDataType();
		
		System.out.println("byte DataType");
		System.out.println("size in bytes : 1");
		System.out.println("range : -128 to 127");
		System.out.println("byte Default Value : "+dataType.b);
		
		System.out.println("short DataType");
		System.out.println("size in bytes : 2");
		System.out.println("range : -32768 to 32767");
		System.out.println("short Default Value : "+dataType.s);
		
		System.out.println("int DataType");
		System.out.println("size in bytes : 4");
		System.out.println("range : -2147483648 to 2147483647");
		System.out.println("int Default Value : "+dataType.i);
		
		System.out.println("long DataType");
		System.out.println("size in bytes : 8");
		System.out.println("range : -9223373036854775808 to 9223373036854775807");
		System.out.println("long Default Value : "+dataType.l);
	}

}
