package com.assignment.app;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of Raju: ");
		double salary = sc.nextDouble();
		double total = salary+(salary*.4)+(salary*.6);
		System.out.println("Total salary of Raju: "+(total));
		sc.close();
	}

}
