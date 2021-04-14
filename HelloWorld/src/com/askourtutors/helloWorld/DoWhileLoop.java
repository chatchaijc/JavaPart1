package com.askourtutors.helloWorld;

//Lab7
class DoWhileLoop {
	public static void main(String[] args) {
		int counter = 20;
		int Numb = 50;
		do {
			System.out.println("Counter:" + counter);
//			checkNumber(counter);
			counter--;
		} while (counter > 0);

		do {
			checkNumber(Numb);
//			System.out.println("Check Number :" + Numb);
			Numb--;
		} while (Numb % 2 == 1);

	}

	// method
	public static void checkNumber(int Num) {
		if (Num % 2 == 0) {
			System.out.println("It is even number. : " + Num);
		} else {
			System.out.println("It is odd number. : " + Num);
		}
	}

}
