package com.askourtutors.helloWorld;
//Lab4
public class ControlFlow {
	public static void main(String[] args) {
		int score = 40;
		if (score < 50) {
			System.out.println("Fail");
		}else if (score >= 80) {
			System.out.println("Good");
		}else if (score >= 50 && score < 80) 
			System.out.println("Normal");
	}

}
