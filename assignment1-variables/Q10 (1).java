package com.assignment.app;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		int temp,rev=0;
		while(a>0) {
			temp=a%10;
			rev+=temp;
			a=a/10;
		}
		System.out.println("Sum = "+rev);
		sc.close();

	}

}
