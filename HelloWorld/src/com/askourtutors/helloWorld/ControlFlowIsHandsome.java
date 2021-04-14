package com.askourtutors.helloWorld;

//Lab4_1
public class ControlFlowIsHandsome {
	public static void main(String[] args) {
		int score = 49;
		boolean isHandsome = true;
		if (isHandsome == true) {
			System.out.println("Good");
		} else {
			if (score < 50) {
				System.out.println("Fail");
			} else if (score >= 80) {
				System.out.println("Good");
			} else if (score >= 50 && score < 80)
				System.out.println("Normal");
		}

	}

}
