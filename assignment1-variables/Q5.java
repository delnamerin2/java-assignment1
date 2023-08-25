package com.assignment.app;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = sc.nextDouble();
		System.out.println("Enter b: ");
		double b = sc.nextDouble();
		
		System.out.println("Quotient is "+(a/b)+" and remainder is "+(a%b));
		sc.close();
	}

}
