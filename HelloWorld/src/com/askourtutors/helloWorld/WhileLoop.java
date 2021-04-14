package com.askourtutors.helloWorld;

//Lab6
public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		int sumi = 0;
		int myArray[] = {1,2,3,4,5};
		System.out.println("Answer 6.1");
		while (i <= 10) {
			System.out.println("i = " + i);
			sumi = sumi + i;
			i++;
			// System.out.println(sumi);
		}
		System.out.println("Answer 6.2");
		System.out.println("Sum of 1 to 10 = " + sumi);

//		for (int counter = 0; counter <= 100; counter++) {
//			if (counter % 12 == 0) {
//				System.out.println("It is divisible by 12. : " + counter);
//			}
//
//		}
		System.out.println("Answer 6.3");
		devideTwelve();
		
		System.out.println("Answer 6.4");
		for(int myArr : myArray) {
			System.out.println("My array : " + myArr);
		}
		
		
	}
	public static void devideTwelve() {
		for (int counter = 1; counter <= 100; counter++) {
			if (counter % 12 == 0) {
				System.out.println("It is divisible by 12. : " + counter);
			}
		}
	}

}
