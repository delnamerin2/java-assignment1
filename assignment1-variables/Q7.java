package com.assignment.app;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit: ");
		double temp = sc.nextDouble();
		System.out.println("Temperature in Celcius is: "+(temp-32)*5/9);
		
		sc.close();
	}

}
