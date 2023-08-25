package com.assignment.app;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter i: ");
		int a = sc.nextInt();		
		System.out.println("Enter j: ");
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("i = "+a);
		System.out.println("j = "+b);
		sc.close();
	}
}
