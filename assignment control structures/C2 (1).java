package com.assignment.app;

import java.util.Scanner;

class Verify{
	
	public void check(int pin) {
		int y = 2023;
		if(pin==y) {
			System.out.println("Valid Pin");
		}
		else
			System.out.println("Invalid Pin");
	}
}

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pin: ");
		p = sc.nextInt();
		
		Verify obj = new Verify();
		obj.check(p);
		
		sc.close();
	}

}
