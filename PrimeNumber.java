package com.BridgeLabz.Day6PracticeProblem;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		boolean flag =false;
		if(n==0 || n==1)
		{
			System.out.println("Not Prime Numbers.");
		}
		else
		{
			for(int i = 2; i<=n/2;i++) {
			if(n%i==0) {
				flag = true;
			}
			}
		}
		if(!flag) {
			System.out.println("Prime numbers.");
		}else
		{
			System.out.println("Not a Prime Numbers.");
		}
		
		
		
		
	}

}
