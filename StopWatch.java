package com.BridgeLabz.Day6PracticeProblem;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter '1' to Start Stopwatch : ");
		int watch = s.nextInt();
		long startMillis = System.currentTimeMillis();
		
		System.out.println("Stopwatch Started at "+startMillis);
		System.out.println("Enter '0' to Stop Stopwatch : ");
		watch = s.nextInt();
		long stopMillis = System.currentTimeMillis();
		System.out.println("Stopwatch Stopped at "+stopMillis);
		double elapse = stopMillis - startMillis;
		double seconds = elapse / 1000;
		System.out.println("Time Elapse in Seconds = " + seconds);
	}

}
