package com.assignment.app;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short month;
		System.out.println("Enter the month number: ");
		Scanner sc = new Scanner(System.in);
		month = sc.nextShort();
		if(month == 1 || month == 2 || month == 12) {
			System.out.println("Season is Winter");
		}
		else if(month == 3 || month == 4 || month == 5) {
			System.out.println("Season is Spring");
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.println("Season is Summer");
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.println("Season is Autumn");
		}
		else
			System.out.println("Invalid Entry");
		sc.close();
	}

}
