package com.askourtutors.helloWorld;

public class BreakFor {
	public static void main(String[] args) {
		for (int counter = 0; counter <= 20; counter++) {
			System.out.println("Counter :" + counter);
			if (counter == 11)
				break;
		}
	}

}
