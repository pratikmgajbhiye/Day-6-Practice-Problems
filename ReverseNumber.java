package com.BridgeLabz.Day6PracticeProblem;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number : ");//User Input
		
		int num = sc.nextInt();
		int reverse =0;
		int remainder;
		System.out.println("Actual Number : "+num);
		for(int i=num;i>0;) {
		remainder=i%10;
		reverse=reverse*10+remainder;
		i=i/10;
		}	
		System.out.println("Reverse Number : "+reverse);

	}

}
