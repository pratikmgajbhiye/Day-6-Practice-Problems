package com.BridgeLabz.Day6PracticeProblem;

import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if(num % i==0)
			{
				sum =sum + i;	
			}
		}
		if(sum==num) 
		{
		System.out.println(" is a Perfect Number");
		}
		else 
		{
			System.out.println(" is not a Perfect Number");
		}
	}
}

