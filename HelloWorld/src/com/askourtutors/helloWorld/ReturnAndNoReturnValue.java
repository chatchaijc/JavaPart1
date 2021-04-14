package com.askourtutors.helloWorld;

// Lab11
public class ReturnAndNoReturnValue {

	public static void main(String[] args) {
		// Return value
		String myWord = "Hello Boss";
		System.out.println(sayHi(myWord) + " Joe");
		// No return value
		sayHello(myWord);
	}

	public static String sayHi(String word) {
		return word;
	}

	public static void sayHello(String word) {
		System.out.println(word + ". Why don't return your word to me!!");
	}
}
