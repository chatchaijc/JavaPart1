package com.askourtutors.helloWorld;
//Lab2
public class VariableScope {
	public static void main(String[] args) {
		barkMethod();
		float myFloat = 10.1f;
		int myInt = (int) myFloat;
			System.out.println("My Float  = " + myFloat);
			System.out.println("My Int  = " + myInt);
		int myInt1 = 100;
		float myFloat1 =  myInt1;
			System.out.println("My Float1  = " + myFloat1);
			System.out.println("My Int1  = " + myInt1);	
		double myDouble = 1000.1234d;
		float myFloat2 =  (float) myDouble;
			System.out.println("My Float2  = " + myFloat2);
			System.out.println("My Double  = " + myDouble);
		char myChar = 'A';
		int myInt2 =  myChar;
			System.out.println("My Char  = " + myChar);
			System.out.println("My Int2  = " + myInt2);
		final String hello = "Hello";
			//String hello = "World"; // error 
			System.out.println("Change final variable 'Hello' : " + hello);
		
	}
	public static void barkMethod() {
		String dogName = "Wink";
		System.out.println("Dog name : " + dogName);
	}
	
}
