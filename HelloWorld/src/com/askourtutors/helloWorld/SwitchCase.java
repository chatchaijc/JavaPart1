package com.askourtutors.helloWorld;

//Lab5
public class SwitchCase {
	public static void main(String[] args) {
		int score = 60;
		String gread = "";
		switch (score) {
		case 80:
			gread = "A";
			break;
		case 70:
			gread = "B";
			break;
		case 60:
			gread = "C";
			break;
		case 50:
			gread = "D";
			break;
		case 40:
			gread = "E";
			break;
		default:
			gread = "F";

		}
		System.out.println("Your gread is : " + gread);
	}

}
