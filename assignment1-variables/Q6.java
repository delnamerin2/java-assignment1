package com.assignment.app;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance: ");
		double a = sc.nextDouble();

		System.out.println("Distance in meters: "+(a*1000));
		System.out.println("Distance in feet: "+(a*3280.84));
		System.out.println("Distance in inches: "+(a*39370.08));
		System.out.println("Distance in meters: "+(a*100000));
		
		
		sc.close();

	}

}
