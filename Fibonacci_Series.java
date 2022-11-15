package com.BridgeLabz.Day6PracticeProblem;

public class Fibonacci_Series {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 1;
		int num3;
		int count = 10;

		// printing 0 and 1
		System.out.print(num1 + " " + num2);

		for (int i = 2; i < count; i++)
		// loop starts from 2 because 0 and 1 are already printed
		{
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
