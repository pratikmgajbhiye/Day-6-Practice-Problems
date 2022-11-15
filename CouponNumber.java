package com.BridgeLabz.Day6PracticeProblem;

import java.util.*;

public class CouponNumber {

	public static boolean isPresent(int a[], int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("How Many Random Numbers Do You\r\n" + "Need to Generate a Distinct Coupon Number ?");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int randomNum = 0;
		int arr[] = new int[size];
		Random coupon = new Random();
		boolean return1;

		for (int i = 0; i < arr.length; i++) {
			randomNum = coupon.nextInt(20);
			return1 = isPresent(arr, randomNum);
			if (return1 != true) {
				arr[i] = randomNum;
			} else {
				--i;
			}
		}

		
		System.out.println("The Random Numbers Generated are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

}
}
