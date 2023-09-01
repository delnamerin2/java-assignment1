package com.assignment.app;

import java.util.Scanner;

public class C9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double realValue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		realValue = sc.nextDouble();
		System.out.println("After converting to int "+(int)realValue);
		sc.close();
	}

}
