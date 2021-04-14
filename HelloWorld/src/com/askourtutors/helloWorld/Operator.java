package com.askourtutors.helloWorld;
//Lab3
public class Operator {
	public static void main (String[] args) {
		int myInt = 20;
		myInt++;
		myInt++;
		myInt++;
		myInt++;
		myInt++;
		System.out.println("My int1 = " + myInt );
		myInt--;
		myInt--;
		myInt--;
		myInt--;
		myInt--;
		System.out.println("My int2 = " + myInt);
		float myValue1 = 10.111f;
		float myValue2 = 10.222f;
		if((myValue1 == 10.111) && (myValue2 == 10.222)) // system undefined
		System.out.println("My value1 and value2 are 10.111 and 10.222.");
		char myValue3 = 'a';
		char myValue4 = 'b';
		//if((myValue3 == a) || (myValue4 == B)) // system undefined
		System.out.println("My char");
	}

}
